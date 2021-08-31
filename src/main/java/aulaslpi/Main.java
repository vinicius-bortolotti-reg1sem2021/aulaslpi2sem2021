package aulaslpi;

import aulaslpi.modelos.Aluno;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = Aluno.builder()
				.curso("aloha")
				.rm(455)
				.idade(45)
				.build();
		
		log.info("Aloha");
	}

}
