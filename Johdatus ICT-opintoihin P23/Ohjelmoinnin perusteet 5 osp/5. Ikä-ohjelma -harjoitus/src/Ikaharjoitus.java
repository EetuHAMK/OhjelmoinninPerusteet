public class Ikaharjoitus {

    public static void main(String[] args) {
        int ika = 18;

        // Tulostusehdot

        if (ika >= 0 && ika < 18) 
			{
            	System.out.println("Olet alaikäinen.");
				if (ika == 15) 
				{
					System.out.println("Saat ajaa mopoa.");
				}
				if (ika >= 16 && ika < 18)
				{
					System.out.println("Saat ajaa kevytmoottoripyörää.");
				}
        	}
		else if (ika == 18)
		{
			System.out.println("Olet täysi-ikäinen, saat ajaa autoa.");
		}
		if (ika >= 40 && ika <= 50) 
		{
			System.out.println("Parasta keski-ikää!");
		}
		else if (ika >= 58)
			{
				System.out.println("Voit mennä varhaiseläkkeelle.");
				if (ika >= 65) 
				{
            	System.out.println("Olet eläkeläinen.");
				}
				if (ika == 65)
				{
				System.out.println("Hyviä eläkepäiviä!");
				}
			}	
		if (ika % 10 == 0)
			{
				System.out.println("Onnea tasavuosikymmenestä!");
				if (ika == 100)
				{
				System.out.println("""
				Onnea,
				olet jo vanha,
				ja elänyt pitkään.""");
				}
			}
		else
		{
            System.out.println("Olet aikuinen.");
        }

    }
}
