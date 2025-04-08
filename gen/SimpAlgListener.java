// Generated from C:/Users/gabriel/Downloads/Compressed/Trab_SimpAlg/projeto1/projeto1/src/SimpAlg.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpAlgParser}.
 */
public interface SimpAlgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpAlgParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpAlgParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(SimpAlgParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(SimpAlgParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(SimpAlgParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(SimpAlgParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(SimpAlgParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(SimpAlgParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(SimpAlgParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(SimpAlgParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(SimpAlgParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(SimpAlgParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void enterComandoPrint(SimpAlgParser.ComandoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void exitComandoPrint(SimpAlgParser.ComandoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#printParams}.
	 * @param ctx the parse tree
	 */
	void enterPrintParams(SimpAlgParser.PrintParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#printParams}.
	 * @param ctx the parse tree
	 */
	void exitPrintParams(SimpAlgParser.PrintParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#printParam}.
	 * @param ctx the parse tree
	 */
	void enterPrintParam(SimpAlgParser.PrintParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#printParam}.
	 * @param ctx the parse tree
	 */
	void exitPrintParam(SimpAlgParser.PrintParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#comandoScan}.
	 * @param ctx the parse tree
	 */
	void enterComandoScan(SimpAlgParser.ComandoScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#comandoScan}.
	 * @param ctx the parse tree
	 */
	void exitComandoScan(SimpAlgParser.ComandoScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void enterComandoIf(SimpAlgParser.ComandoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void exitComandoIf(SimpAlgParser.ComandoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#comandoWhile}.
	 * @param ctx the parse tree
	 */
	void enterComandoWhile(SimpAlgParser.ComandoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#comandoWhile}.
	 * @param ctx the parse tree
	 */
	void exitComandoWhile(SimpAlgParser.ComandoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#iDList}.
	 * @param ctx the parse tree
	 */
	void enterIDList(SimpAlgParser.IDListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#iDList}.
	 * @param ctx the parse tree
	 */
	void exitIDList(SimpAlgParser.IDListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#expLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpLogica(SimpAlgParser.ExpLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#expLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpLogica(SimpAlgParser.ExpLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#expressaoOR}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoOR(SimpAlgParser.ExpressaoORContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#expressaoOR}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoOR(SimpAlgParser.ExpressaoORContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#expressaoAND}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAND(SimpAlgParser.ExpressaoANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#expressaoAND}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAND(SimpAlgParser.ExpressaoANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#expressaoIGUAL}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoIGUAL(SimpAlgParser.ExpressaoIGUALContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#expressaoIGUAL}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoIGUAL(SimpAlgParser.ExpressaoIGUALContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(SimpAlgParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(SimpAlgParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SimpAlgParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SimpAlgParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpAlgParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpAlgParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpAlgParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpAlgParser.StartContext ctx);
}