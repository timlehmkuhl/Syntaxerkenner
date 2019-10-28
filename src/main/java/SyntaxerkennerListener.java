// Generated from G:/InfProjekte/Syntaxerkenner/src/main/java\Syntaxerkenner.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxerkennerParser}.
 */
public interface SyntaxerkennerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxerkennerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SyntaxerkennerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxerkennerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SyntaxerkennerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxerkennerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SyntaxerkennerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxerkennerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SyntaxerkennerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxerkennerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SyntaxerkennerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxerkennerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SyntaxerkennerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxerkennerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SyntaxerkennerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxerkennerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SyntaxerkennerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxerkennerParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(SyntaxerkennerParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxerkennerParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(SyntaxerkennerParser.FactContext ctx);
}