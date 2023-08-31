class PessoaTest(){
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa()
    }

    @Test
    void deveRetornarSexoInvalido(){
        try{
            pessoa.setSexo("A");
            fail();
        } catch(IllegalArgumentoException e) {
            assertEquals(expected: "Sexo inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarSexoFemininoValido(){
        pessoa.setSexo("F");
        assertEquals(expected: "F", pessoa.getSexo());
    }

    @Test
    void deveRetornarSexoMasculinooValido(){
        pessoa.setSexo("M");
        assertEquals(expected: "M", pessoa.getSexo());
    }

    @Test
    void deveRetornarFemininoAbaixoPeso(){
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals(expected: "abaixo do peso", pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal(){
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals(expected: "no peso normal", pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcima(){
        pessoa.setPeso(27.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals(expected: "marginalmente acima do peso", pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal(){
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals(expected: "acima do peso ideal", pessoa.calculaImc());
    }

    @Test
    void deveRetornarFemininoObeso(){
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals(expected: "acima do peso ideal", pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso(){
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals(expected: "abaixo do peso", pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal(){
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals(expected: "no peso normal", pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcima(){
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals(expected: "marginalmente acima do peso", pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdeal(){
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals(expected: "acima do peso ideal", pessoa.calculaImc());
    }

    @Test
    void deveRetornarMasculinoObeso(){
        pessoa.setPeso(31.1f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals(expected: "acima do peso ideal", pessoa.calculaImc());
    }
}