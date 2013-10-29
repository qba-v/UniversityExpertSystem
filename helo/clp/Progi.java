package helo.clp;


public class Progi {
	
	
static int AGH(int Podst , int Roz , int J_Podst , int J_Roz){ 	//J - jezyk obcy podst - wynik z przedmiotu podstatowego , roz rozszerzonego
	int W=0; // = 4 · G + J ;
	int G=0; // G - liczba punktow wyliczona 
	int J=0; //Wynik z jezyka wyliczony
	//MATURA Z PRZEDMIOTU WIODACEGO
	if (Podst<0 || Podst>100)	{
			System.out.println("Wprowadz poprawne wyniki z matury");
			 return 0;
		}
	else if (Roz <0 || Roz>100) {
		System.out.println("Wprowadz poprawne wyniki z matury");
		return 0;
	}
	else if(Roz==0)
		G=Podst;
	else if (Roz<30)
		G=Roz;
	else if (Roz>30 && Roz<80)//N + 2⋅(N-30)
		G= Roz + 2*(Roz-30);
	else if (Roz>80 && Roz<=100)
		G= Roz+100;

	//MATURA Z JEZYKA
	if (J_Podst<0 || J_Podst>100)	{
			System.out.println("Wprowadz poprawne wyniki z matury");
			 return 0;
		}
	else if (J_Roz <0 || J_Roz>100) {
		System.out.println("Wprowadz poprawne wyniki z matury");
		return 0;
	}
	else if(J_Roz==0)
		J=J_Podst;
	else if (Roz<30)
		J=J_Roz;
	else if (J_Roz>30 && J_Roz<80)
		J= J_Roz + 2*(J_Roz-30);
	else if (J_Roz>80 && J_Roz<=100)
		J= J_Roz+100;

	W=4*G+J;
	
	if(J<=200 || G<=200)
	return W;
	else {
		System.out.println("Podaj poprawne wyniki z matury");
	return 0;
		}
}

static int PK_W(int P , int R) {
	int W;
	if(P<0 || P>100 || R<0 || R>100)	{
		System.out.println("Podaj poprawne wyniki z matury");
	return 0;
	}
	else if(R==0)
		W=P;
	else
		W=2*R;
	if(W<=200)
	return W;
	else {
		System.out.println("Podaj poprawne wyniki z matury");
	return 0;
	}
}
static int PK_AIU(int R1 , int R2 , int J_P , int J_R, int H_P , int H_R , int M_P , int M_R)	
{		//języka polskiego (J), historii lub historii sztuki (H) i matematyki (M)
	int W;
	int J,H,M;
	if(R1<0 || R2<0 || J_P<0 || H_P<0 || M_P<0)	{
		System.out.println("Sprawdz poprawnosc wpisanych danych");
		return 0;
	}
	J=PK_W(J_P , J_R);
	H=PK_W(H_P , H_R);
	M=PK_W(M_P , M_R);
	
	W=R1 + R2 + (J+H+M)/6;
	if(W<=300)
	return W;
	else {
		System.out.println("Podaj poprawne wyniki z matury");
	return 0;
	}
}
static int PK_AK(int R1 , int R2 , int J_P , int J_R , int G_P , int G_R , int M_P , int M_R) //g- geografia
{
	int W=PK_AIU(R1,R2,J_P,J_R,G_P,G_R,M_P,M_R);
	return W;
}

public static void main(String[] args) {
    int cos=0;
    cos=AGH(100,70,100,90);
    System.out.print(cos);
    System.out.print("\n");
    cos=PK_W(70,60);
    System.out.print(cos);

	}


}
