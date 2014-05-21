import java.util.Scanner;


public class clas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Cuestionario");
//a continuacion se haran las preguntas
		System.out.println("En que año fue el prmer mundial de Honduras?");
		int x1 = s.nextInt();
		{
			if (x1 == 1982)
				System.out.println("Correcto");
			else
				System.out.println("Incorrecto");
		}
		System.out.println("A cuantos mudiales a ido Honduras?");
		int x2 = s.nextInt();
		{
			if (x2 == 3)
				System.out.println("Correcto");
			else
				System.out.println("Incorrecto");
		}
		System.out.println("Cuantos años pasaron para que Honduras regresara a un mundial?");
		int x3 = s.nextInt();
		{
			if (x3 == 28)
				System.out.println("Correcto");
			else
				System.out.println("Incorrecto");
		}
		System.out.println("Cuanto es el periodo de un presidente?");
		int x4 = s.nextInt();
		{
			if (x4 == 4)
				System.out.println("Correcto");
			else
				System.out.println("Incorrecto");
		}
		System.out.println("Cuantos departamentos tiene Honduras?");
		int x5 = s.nextInt();
		{
			if (x5 == 18)
				System.out.println("Correcto");
			else
				System.out.println("Incorrecto");
		}
		//este procedimiento es para sacar el porcentaje de respuestas correctas
		System.out.println("el porcentaje de respuesta correctas es:");
		{
			if (x1 == 1982)
				x1 = 20;
			else x1 = 0;

			if (x2 == 3)
				x2 = 20;
			else x2 = 0;

			if (x3 == 28)
				x3 = 20;
			else x3 = 0;

			if (x4 == 4)
				x4 = 20;
			else x4 = 0;

			if (x5 == 18)
				x5 = 20;
			else x5= 0;
		}
		//aqui depende a tu promedio de respuestas buenas obtendras esto
		System.out.println(x1+x2+x3+x4+x5 + "%");
		if ((x1+x2+x3+x4+x5) >= 60)
			System.out.println("Excelente");
		else
			System.out.println("Depcionante");
}
	
}