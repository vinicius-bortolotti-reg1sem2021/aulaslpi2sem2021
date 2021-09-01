package aulaslpi;

import java.util.Scanner;

import aulaslpi.designpattern.factory.Bike;
import aulaslpi.designpattern.factory.Carro;
import aulaslpi.designpattern.factory.Moto;
import aulaslpi.designpattern.factory.TiposDeVeiculo;
import aulaslpi.designpattern.factory.Veiculo;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha um tipo");
		String tipo = scan.next();
		Veiculo meuVeiculo = factory(tipo.toUpperCase());
		meuVeiculo.buzina();
	
	}
	
	public static Veiculo factory(String tipo) {
		if(TiposDeVeiculo.BIKE.name().equals(tipo)) {
			return new Bike();
		} else if( TiposDeVeiculo.MOTO.name().equals(tipo)) {
			return new Moto();
		} else {
			return new Carro();
		}		
	}	

}

