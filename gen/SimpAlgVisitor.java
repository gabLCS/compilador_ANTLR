// Generated from C:/Users/gabriel/Downloads/Compressed/Trab_SimpAlg/projeto1/projeto1/src/SimpAlg.g4 by ANTLR 4.13.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpAlgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpAlgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpAlgParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(SimpAlgParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(SimpAlgParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(SimpAlgParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(SimpAlgParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(SimpAlgParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#comandoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPrint(SimpAlgParser.ComandoPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#printParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintParams(SimpAlgParser.PrintParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#printParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintParam(SimpAlgParser.PrintParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#comandoScan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoScan(SimpAlgParser.ComandoScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#comandoIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoIf(SimpAlgParser.ComandoIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#comandoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoWhile(SimpAlgParser.ComandoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#iDList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDList(SimpAlgParser.IDListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#expLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLogica(SimpAlgParser.ExpLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#expressaoOR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoOR(SimpAlgParser.ExpressaoORContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#expressaoAND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAND(SimpAlgParser.ExpressaoANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#expressaoIGUAL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoIGUAL(SimpAlgParser.ExpressaoIGUALContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(SimpAlgParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(SimpAlgParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpAlgParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpAlgParser.StartContext ctx);
}