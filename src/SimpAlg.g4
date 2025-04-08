grammar SimpAlg;

@header {
    import java.util.*;
}

@parser :: members {
    Map<String, Integer> tabela = new HashMap<String, Integer>();
    ArrayList<String> code = new ArrayList<String>();
    int cont = 0;
    int linhaV, linhaF;
    String newTemp() {
        cont++;
        return "_t" + Integer.toString(cont);
    }
    String newLabel() {
        cont++;
        return ".l" + Integer.toString(cont);
    }
    boolean isVariavel(String str) {
        return tabela.containsKey(str);
    }

    boolean isNumero(String str) {
        return str.matches("^-?\\d*\\.?\\d+$");
    }
    boolean isIntType(String str) {
        return str.matches("^-?\\d+$");
    }
}

INT: 'int';
BOOL: 'true' | 'false';
COMMENT: '//' ~[\r\n]* -> skip;
STRING: '"' (~["\t\r\n] | '""' | '\\"')* '"';
FLOAT: 'float';
PRINT: 'print';
SCAN: 'scan';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
ID: [a-zA-Z][a-zA-Z0-9]*;
NUM : [0-9]+;
NUMREAL : [0-9]+ '.' [0-9]+;
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
EQ: '==';
NEQ: '!=';
NOT: '!';
AND: 'and';
OR: 'or';
SEMI: ';';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
WS: [ \t\r\n]+ -> skip; // ignorar espaços em branco

program: 'var' LBRACE declaracoes RBRACE 'program' LBRACE comandos RBRACE{
System.out.println("\nfrom goto import with_goto");
System.out.println("@with_goto");
System.out.println("def main(): ");
for (int i = 0; i < code.size() ; i++)
System.out.println(code.get(i));
System.out.println("main()");
};

declaracoes: (declaracao SEMI)+;

declaracao: INT ID{
            if (!tabela.containsKey($ID.text)) tabela.put($ID.text, 1);
            else throw new ArithmeticException("variavel ja declarada");
            } |
            FLOAT ID {
            if (!tabela.containsKey($ID.text)) tabela.put($ID.text, 2);
            else throw new ArithmeticException("variavel ja declarada");
            };

comandos returns [String code] :{$code = "";} (a=comando {$code += $a.code;})*(COMMENT)*;

comando returns [String code] :
          comandoPrint SEMI
        | comandoScan SEMI
        | comandoIf
        | comandoWhile
        | atribuicao SEMI;

atribuicao returns [String code]: ID '=' expressao {
if(!tabela.containsKey($ID.text)){
throw new ArithmeticException("variavel não declarada");
}

code.add("\t" + $ID.text + " = " +  $expressao.var);


};

comandoPrint returns [String code]: 'print' LPAREN a=printParams RPAREN{
String VarA = new String();
VarA = $a.var;
code.add("\tprint (" + VarA + ");");
} ;

printParams returns [String var]: a=printParam {String test = new String();}(COMMA b=printParam{test = test + "," + $b.var;})*
{
String temp = new String();
temp = $a.var;
$var = newTemp();
if($b.var!=null){
temp = temp  + test;
}
$var = temp;
};

printParam returns [String var] : a=expressao
{$var = $a.var;} |
 b=STRING {$var = $b.text;}|
 c=NUM {$var = $c.text;};

comandoScan: SCAN LPAREN iDList RPAREN;

iDList returns [String var]: ID (COMMA ID)*;

comandoIf returns [String code]: IF LPAREN c=expLogica RPAREN LBRACE {
linhaV = code.size();
String tmp = newTemp();
String lfalse = newLabel();
code.add(linhaV, "\t" + tmp + " = " + $c.var);
code.add(linhaV+1,"\tif " + tmp + " == false: goto " + lfalse);
}
a=comandos {
int linhaX = code.size();
String lend = newLabel();
code.add(linhaX, "\tlabel " + lfalse);
}
 RBRACE (ELSE LBRACE
 {
 int linhaT = code.size();
 code.add(linhaX, "\tgoto " + lend);

 }  b=comandos {
 linhaF = code.size();
 code.add(linhaF,"\tlabel " + lend);
 } RBRACE)?;


comandoWhile returns [String code]: 'while' LPAREN a=expLogica
 {
 linhaV = code.size();
 String tmp = newTemp();
 String lfalse = newLabel();
 String lreturn = newLabel();
 code.add(linhaV, "\t" + tmp + " = " + $a.var);
 code.add(linhaV+1,"\tif " + tmp + " == false: goto " + lfalse);
 code.add(linhaV+1,"\tlabel " + lreturn);
 }
 RPAREN LBRACE b=comandos
 {
 int linhaT = code.size();
 code.add(linhaT, "\tgoto " + lreturn);
 code.add(linhaT+1, "\tlabel " + lfalse);
 }
 RBRACE;



expLogica returns [String var]: a=expressaoOR{ $var = $a.var;};

expressaoOR returns [String var]: a=expressaoAND {$var = $a.var;} (OR b=expressaoAND{ $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " or " + $b.var); })* ;

expressaoAND returns [String var]: a=expressaoIGUAL {$var = $a.var;} (AND b=expressaoIGUAL{ $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " and " + $b.var); })*;

expressaoIGUAL returns [String var]: a=expressaoRelacional{$var = $a.var;} (EQ b=expressaoRelacional{ $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " == " + $b.var); })?|
                                     a=expressaoRelacional (NEQ b=expressaoRelacional{ $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " !> " + $b.var); })?;

expressaoRelacional returns [String var]:
                        a=expressao {$var = $a.var;} ('<' b=expressao  { $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " < " + $b.var); })?|
                        a=expressao {$var = $a.var;} ('>' b=expressao  { $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " > " + $b.var); })?|
                        a=expressao {$var = $a.var;} ('<=' b=expressao { $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " <= " + $b.var); })?|
                        a=expressao {$var = $a.var;}  ('>=' b=expressao { $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " >= " + $b.var); })?|
                        a=expressao {$var = $a.var;} ('==' b=expressao { $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " == " + $b.var); })?|
                        a=expressao {$var = $a.var;} ('!=' b=expressao { $var = newTemp(); code.add("\t" + $var + " = " + $a.var + " != " + $b.var); })?;



expressao returns [String var]:
              a=expressao '*' b=expressao {
                  if(isNumero($a.var) && isNumero($b.var)) {
                      if(isIntType($a.var) && isIntType($b.var)) {
                          // Se ambos forem inteiros, não fazer nada
                      } else {
                          if(isIntType($a.var)) {
                              System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                              $a.var += ".0";
                          }
                          if(isIntType($b.var)) {
                              System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                              $b.var += ".0";
                          }
                      }
                  }

                  if(isNumero($a.var) && !isNumero($b.var)) {
                      if(isIntType($a.var) && tabela.get($b.var) == 1) {
                          // Se ambos forem inteiros, não fazer nada
                      } else {
                          if(isIntType($a.var)) {
                              System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                              $a.var += ".0";
                          }
                          if(tabela.get($b.var) == 1) {
                              System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                              tabela.put($b.var, 2);
                          }
                      }
                  }

                  if(!isNumero($a.var) && isNumero($b.var)) {
                      if(tabela.get($a.var) == 1 && isNumero($b.var)) {
                          // Se ambos forem inteiros, não fazer nada
                      } else {
                          if(tabela.get($a.var) == 1) {
                              System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                              tabela.put($a.var, 2);

                              if(isIntType($b.var)) {
                                  System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                  $b.var += ".0";
                              }
                          }
                      }
                  }

                  if(!isNumero($a.var) && !isNumero($b.var)) {
                      if(tabela.get($a.var) == 1 && tabela.get($b.var) == 1) {
                          // Se ambos forem inteiros, não fazer nada
                      } else {
                          if(tabela.get($a.var) == 1) {
                              System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                              tabela.put($a.var, 2);
                          }
                          if(tabela.get($b.var) == 1) {
                              System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                              tabela.put($b.var, 2);
                          }
                      }
                  }

                  $var = newTemp();
                  code.add("\t" + $var + " = " +  $a.var + " * " + $b.var);
              }
              | a=expressao '%' b=expressao{
              $var = newTemp();
              if(!isIntType($a.var) || !isIntType($b.var) || $a.var.equals("0")  || $b.var.equals("0")){
              System.out.println("erro: Expressao mod usando float ou 0");
              throw new ArithmeticException("Mod por zero, ou numero real não permitida.");
              }else{
              code.add("\t" + $var + " = " +  $a.var + " % " + $b.var);
              }
              }
              | a=expressao '/' b=expressao{
                            $var = newTemp();
                            if($b.var.equals("0")){
                            System.out.println("erro: Expressao divisao usando 0");
                            throw new ArithmeticException("Divisao por zero não permitida.");
                            }else{
                                  if(isNumero($a.var) && isNumero($b.var)) {
                                                  if(isIntType($a.var) && isIntType($b.var)) {
                                                      // Se ambos forem inteiros, não fazer nada
                                                  } else {
                                                      if(isIntType($a.var)) {
                                                          System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                          $a.var += ".0";
                                                      }
                                                      if(isIntType($b.var)) {
                                                          System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                          $b.var += ".0";
                                                      }
                                                  }
                                              }

                                              if(isNumero($a.var) && !isNumero($b.var)) {
                                                  if(isIntType($a.var) && tabela.get($b.var) == 1) {
                                                      // Se ambos forem inteiros, não fazer nada
                                                  } else {
                                                      if(isIntType($a.var)) {
                                                          System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                          $a.var += ".0";
                                                      }
                                                      if(tabela.get($b.var) == 1) {
                                                          System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                          tabela.put($b.var, 2);
                                                      }
                                                  }
                                              }

                                              if(!isNumero($a.var) && isNumero($b.var)) {
                                                  if(tabela.get($a.var) == 1 && isNumero($b.var)) {
                                                      // Se ambos forem inteiros, não fazer nada
                                                  } else {
                                                      if(tabela.get($a.var) == 1) {
                                                          System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                          tabela.put($a.var, 2);

                                                          if(isIntType($b.var)) {
                                                              System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                              $b.var += ".0";
                                                          }
                                                      }
                                                  }
                                              }

                                              if(!isNumero($a.var) && !isNumero($b.var)) {
                                                  if(tabela.get($a.var) == 1 && tabela.get($b.var) == 1) {
                                                      // Se ambos forem inteiros, não fazer nada
                                                  } else {
                                                      if(tabela.get($a.var) == 1) {
                                                          System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                          tabela.put($a.var, 2);
                                                      }
                                                      if(tabela.get($b.var) == 1) {
                                                          System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                          tabela.put($b.var, 2);
                                                      }
                                                  }
                                              }







                            code.add("\t" + $var + " = " +  $a.var + " / " + $b.var);
                            }
                            }
              | a=expressao '+' b=expressao {
                                        $var = newTemp();
                                        if(isNumero($a.var) && isNumero($b.var)) {
                                        if(isIntType($a.var) && isIntType($b.var)) {
                                            // Se ambos forem inteiros, não fazer nada
                                        } else {
                                            if(isIntType($a.var)) {
                                                System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                $a.var += ".0";
                                            }
                                            if(isIntType($b.var)) {
                                                System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                $b.var += ".0";
                                            }
                                        }
                                    }

                                    if(isNumero($a.var) && !isNumero($b.var)) {
                                        if(isIntType($a.var) && tabela.get($b.var) == 1) {
                                            // Se ambos forem inteiros, não fazer nada
                                        } else {
                                            if(isIntType($a.var)) {
                                                System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                $a.var += ".0";
                                            }
                                            if(tabela.get($b.var) == 1) {
                                                System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                tabela.put($b.var, 2);
                                            }
                                        }
                                    }

                                    if(!isNumero($a.var) && isNumero($b.var)) {
                                        if(tabela.get($a.var) == 1 && isNumero($b.var)) {
                                            // Se ambos forem inteiros, não fazer nada
                                        } else {
                                            if(tabela.get($a.var) == 1) {
                                                System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                tabela.put($a.var, 2);

                                                if(isIntType($b.var)) {
                                                    System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                    $b.var += ".0";
                                                }
                                            }
                                        }
                                    }

                                    if(!isNumero($a.var) && !isNumero($b.var)) {
                                        if(tabela.get($a.var) == 1 && tabela.get($b.var) == 1) {
                                            // Se ambos forem inteiros, não fazer nada
                                        } else {
                                            if(tabela.get($a.var) == 1) {
                                                System.out.println("Coerção realizada do inteiro " + $a.var + " para float");
                                                tabela.put($a.var, 2);
                                            }
                                            if(tabela.get($b.var) == 1) {
                                                System.out.println("Coerção realizada do inteiro " + $b.var + " para float");
                                                tabela.put($b.var, 2);
                                            }
                                        }
                                    }
                  code.add("\t" + $var + " = " +  $a.var + " + " + $b.var);
              }
              | '(' a=expressao ')' {
                  $var = $a.var;
              }
              | NUM {
                  $var = $NUM.text;
              }
              | NUMREAL {
                  $var = $NUMREAL.text;
              }
              | ID {
                  $var = $ID.text;
              }
              ;


start: program;