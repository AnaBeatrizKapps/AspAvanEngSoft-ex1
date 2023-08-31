public class Pessoa {
    private String sexo;
    private Float altura;
    private Float peso;

    public Pessoa(String sexo, Float altura, Float peso){
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    //tabela peso altura para testar em cada bloco
    //análise do valor limite
    //19.0

    public String calculaImc(){
        Float imc = peso/(altura*altura);
        String resultado;

        Float f_abaixo_peso = 19.1f;
        Float f_peso_normal = 25.8f;
        Float f_marginalmente_acima = 27.3f;
        Flaot f_acima_peso_ideal = 32.3f; 

        Float m_abaixo_peso = 20.7f;
        Float m_peso_normal = 26.4f;
        Float m_marginalmente_acima = 27.8f;
        Flaot m_acima_peso_ideal = 31.1f; 

        if(sexo == 'F'){
            if(imc < f_abaixo_peso){
                resultado = 'abaixo do peso';
            } else {
                if(imc < f_peso_normal){
                    resultado = 'no peso normal';
                } else {
                    if(imc < f_marginalmente_acima){
                        resultado = 'marginalmente acima do peso';
                    } else {
                        if(imc < f_acima_peso_ideal){
                            resultado = 'acima do peso ideal';
                        } else {
                            resultado = 'Obeso';
                        }
                    }
                }
            } 
        } else {
            if(imc < m_abaixo_peso){
                resultado = 'abaixo do peso';
            } else {
                if(imc < m_peso_normal){
                    resultado = 'no peso normal';
                } else {
                    if(imc < m_marginalmente_acima){
                        resultado = 'marginalmente acima do peso';
                    } else {
                        if(imc < m_acima_peso_ideal){
                            resultado = 'acima do peso ideal';
                        } else {
                            resultado = 'Obeso';
                        }
                    }
                }
            }
        }
        return resultado;
    }

    public getSexo(){
        return this.sexo;
    }

    public setSexo(String sexo) {
        if(!sexo.equals("F") || !sexo.equals("M")){
            throw new IllegalArgumentoException("Sexo inválido!");
        }
        this.sexo = sexo;
    }

    public getAltura(){
        return this.altura;
    }

    public setAltura(Float altura){
        this.altura = altura;
    }

    public getPeso(){
        return this.peso;
    }

    public setPeso(Float peso){
        this.peso = peso;
    }
}