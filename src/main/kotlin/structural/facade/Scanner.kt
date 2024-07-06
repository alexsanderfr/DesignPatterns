package structural.facade

import java.io.InputStream

class Scanner(inputStream: InputStream) {
    fun scan(): Token {
        return Token()
    }

    class Token
}