package structural.facade

class ProgramNodeBuilder(private val node: ProgramNode) {
    fun newVariable(variableName: String) {}
    fun newAssignment(variable: ProgramNode, expression: ProgramNode) {}
    fun newReturnStatement(expression: ProgramNode) {}
    fun newCondition(condition: ProgramNode, truePart: ProgramNode, falsePart: ProgramNode) {}
    fun getRootNode(): ProgramNode {
        return node
    }
}
