package controlador;

import java.util.ArrayList;

public class Controlador {

    public Controlador() {
    }

    public float calcularLucro(float custoFixoTotal, float custoVariavelTotal, int estimativaVenda, float precoVenda){

        float custoTotal = custoFixoTotal + (custoVariavelTotal * estimativaVenda);
        float receita = precoVenda * estimativaVenda;
        float lucro = receita - custoTotal;
        
        return lucro;
    }
    
    public float calcularCustosVariaveis(ArrayList<Float> custosVariaveis, ArrayList<Integer> custosMateriaPrima){
        
        float somatorio = 0;
        
        for(int i = 0; i < custosVariaveis.size(); i++){
            somatorio += (custosVariaveis.get(i) * custosMateriaPrima.get(i));       
        }  
        return somatorio;   
    }
    
    public float calcularCustosFixos(ArrayList<Float> custosFixos){
        
        float somatorio = 0;
        
        for(int i = 0; i < custosFixos.size(); i++){    
            somatorio = somatorio + custosFixos.get(i);    
        }
        return somatorio; 
    }
    
    public float calcularPreco(float custoVariavelTotal, float margemContribuicao){
        float preco = custoVariavelTotal + (custoVariavelTotal * (margemContribuicao/100));
        return preco;
    }
    
    public int calcularPontoEquilibrio(float custoFixoTotal, float custoVariavelUn, float preco) {
        return ((int) (custoFixoTotal / (preco - custoVariavelUn))) + 1;
    }
}
