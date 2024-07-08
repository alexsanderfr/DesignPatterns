package structural.facade

import java.io.InputStream

class Compiler {
    fun compile(inputStream: InputStream, bytecodeStream: BytecodeStream) {
        val scanner = Scanner(inputStream)
        val programNodeBuilder = ProgramNodeBuilder(ProgramNode())
        val parser = Parser()
        parser.parse(scanner, programNodeBuilder)
        val codeGenerator = CodeGenerator(bytecodeStream)
        val programNode = programNodeBuilder.getRootNode()
        programNode.traverse(codeGenerator)
    }
}