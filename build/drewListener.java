// Generated from drew.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link drewParser}.
 */
public interface drewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link drewParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(drewParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link drewParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(drewParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link drewParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(drewParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link drewParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(drewParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link drewParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(drewParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link drewParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(drewParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link drewParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(drewParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link drewParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(drewParser.ValueContext ctx);
}