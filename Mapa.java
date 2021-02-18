package colecoes2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(20, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size()); // tamanho do map
		System.out.println(usuarios.isEmpty()); // validar se esta vazio
		
		System.out.println(usuarios.keySet()); // mostra as chaves
		System.out.println(usuarios.values()); // mostra os valores
		System.out.println(usuarios.entrySet()); // mostra todos os dados
		System.out.println(usuarios.containsKey(20));  // verifica se tem o valor indicado na chave
		System.out.println(usuarios.containsValue("Rebeca"));  // verifica se tem o valor indicado no campo
		System.out.println(usuarios.get(20)); // retorna o valor da chave indicada

		System.out.println(usuarios.remove(4, "Rebeca")); // remover o valor de um map
		
		// percorrer os valores
		
		for(int chave:usuarios.keySet()) { // percorrera as chaves do map
			System.out.println(chave);
		}
		
		
		for (String valor:usuarios.values()) {  // percorrera os valores do map
			System.out.println(valor);;
		}
		
		for (Entry<Integer, String> registro:usuarios.entrySet()) {  // percorre todos os valores
			System.out.print(registro.getKey() + " => ");
			System.out.println(registro.getValue());
		}
		
		
	}

}
