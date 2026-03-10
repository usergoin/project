/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

    

public class CuriosidadeHistorica {

    public static String obterTextoCuriosidade(int anoNascimento) {
    String eventoEspecifico = obterEventoEspecifico(anoNascimento);
    String eraHistorica = obterEraHistorica(anoNascimento);
   
    String textoCompleto;

    if (eventoEspecifico != null && !eventoEspecifico.isEmpty()) {
        textoCompleto = eventoEspecifico + "<br><br>" + eraHistorica;
    } else {
        textoCompleto = eraHistorica;
    }


    return "<html><div style='text-align: center;'>" + textoCompleto + "</div></html>";
}

    private static String obterEventoEspecifico(int ano) {
        switch (ano) {

            case 1500: return "Em 1500, a expedição de Pedro Álvares Cabral chegou ao Brasil.";
            case 1789: return "Ano da Inconfidência Mineira e da Revolução Francesa.";
            case 1808: return "Em 1808, a Família Real Portuguesa chegou ao Brasil.";
            case 1822: return "Em 1822, o Brasil declarou sua Independência.";
            case 1888: return "Ano em que foi assinada a Lei Áurea, abolindo a escravidão.";
            case 1889: return "Ano da Proclamação da República do Brasil.";
            case 1914: return "Ano de início da Primeira Guerra Mundial.";
            case 1922: return "Ano da Semana de Arte Moderna em São Paulo.";
            case 1939: return "Ano de início da Segunda Guerra Mundial.";
            case 1945: return "Ano do fim da Segunda Guerra Mundial e criação da ONU.";
            case 1964: return "Ano do início do regime militar no Brasil.";
            case 1969: return "Ano em que o homem pisou na Lua pela primeira vez (Apollo 11).";
            case 1985: return "Ano da redemocratização do Brasil (fim do regime militar).";
            case 1988: return "Ano da promulgação da atual Constituição Federal do Brasil.";
            case 2001: return "Ano dos ataques de 11 de setembro e lançamento da Wikipedia.";
            case 2020: return "Ano marcado pelo início da pandemia global de COVID-19.";
            default: return ""; 

        }

    }

    private static String obterEraHistorica(int ano) {

        if (ano < 1500) {
             return "Você nasceu na Idade Média ou períodos anteriores.";

        } else if (ano >= 1500 && ano <= 1600) {
            return "Você viveu durante a Renascença e a Era dos Descobrimentos.";
        } else if (ano > 1600 && ano <= 1750) {
             return "Período do Brasil Colônia e do auge do ciclo do açúcar e início do ouro.";
        } else if (ano > 1750 && ano <= 1850) {
            return "Uma era de revoluções (Industrial, Americana, Francesa) e mudanças políticas.";
        } else if (ano > 1850 && ano <= 1913) {
            return "A 'Belle Époque', período de otimismo e grandes invenções tecnológicas.";
        } else if (ano >= 1914 && ano <= 1945) {
            return "Um período turbulento marcado pelas duas Grandes Guerras Mundiais.";
        } else if (ano > 1945 && ano <= 1990) {
            return "Você nasceu durante a Guerra Fria, com o mundo polarizado.";
        } else if (ano > 1990 && ano <= 2010) {
            return "A era da globalização acelerada e o nascimento da internet comercial.";
        } else {
            return "Você nasceu na Era da Informação, totalmente conectado ao mundo digital.";

        }

    }

}
    
