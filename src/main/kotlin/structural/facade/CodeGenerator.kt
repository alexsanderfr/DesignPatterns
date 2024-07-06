package structural.facade

import sun.jvm.hotspot.interpreter.BytecodeStream

class CodeGenerator(val bytecodeStream: BytecodeStream) {
    fun visit(statementNode: StatementNode) {}
    fun visit(expressionNode: ExpressionNode) {}

    class StatementNode {

    }
    class ExpressionNode {

    }
}
