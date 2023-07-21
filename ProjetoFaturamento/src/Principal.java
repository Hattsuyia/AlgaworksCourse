import com.faturamento.thiago.GestorFiscal;
import com.faturamento.thiago.NotaFiscalProduto;
import com.faturamento.thiago.NotaFiscalServico;

public class Principal {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da Roda", 1100, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());

    }
}
