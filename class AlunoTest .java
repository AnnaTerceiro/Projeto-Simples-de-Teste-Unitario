class AlunoTest {
    void testInscricaoValido() {
        assertTrue(new AlunoValidar().validarAg("123456"));
    }
}

void testInscricaoInValido() {
    assertFalse(new AlunoValidar().validarAg("12345"));
    assertFalse(new AlunoValidar().validarAg("1234567"));
}

public class AlunoValidar {
    public boolean validarAg(String ag) {
        boolean retorno = true;
        if (ag.length() != 6) {
            retorno = false;
        }

        return retorno;

    }
}