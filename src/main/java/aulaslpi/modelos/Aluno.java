package aulaslpi.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {
	
	private int rm;
	private String nome;
	private String curso;
	private int idade;

}
