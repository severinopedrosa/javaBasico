package aula24;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.garantiaMeses);
				}
	
}
