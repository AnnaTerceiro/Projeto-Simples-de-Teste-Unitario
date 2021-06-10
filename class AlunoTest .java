class AlunoTest {
    void testInscricaoValido() {
        assertTrue(new AlunoValidar().validarAg("123456"));
    }
}

void testInscricaoInValido() {
    assertFalse(new AlunoValidar().validarAg("12345"));
    assertFalse(new AlunoValidar().validarAg("1234567"));
}