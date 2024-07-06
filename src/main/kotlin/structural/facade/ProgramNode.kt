package structural.facade

class ProgramNode {
    fun getSourcePosition(line: Int, index: Int) {}
    fun add(program: ProgramNode) {}
    fun remove(program: ProgramNode) {}
    fun traverse(codeGenerator: CodeGenerator) {}
}
