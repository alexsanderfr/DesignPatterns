package structural.facade


class CodeGenerator(val bytecodeStream: BytecodeStream) {
    fun visit(statementNode: StatementNode) {}
    fun visit(expressionNode: ExpressionNode) {}

    class StatementNode {

    }
    class ExpressionNode {

    }
}
