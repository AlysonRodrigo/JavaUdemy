package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosListas {

	public static void main(String[] args) {
		
		java.util.List<String> list = new ArrayList<>();//Criar uma lista 
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");//adicionar um item ao ponto especifico da lista
		
		System.out.println(list.size());
		for (String x : list ) {
			System.out.println(x);
		}//imprimir a lista 
		
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');//remover um item da lista com um caracter especifico
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: "+list.indexOf("Bob"));//Marca aonde esta çpcalizado na lista o item
		System.out.println("Index of Marco: "+list.indexOf("Marco"));//Se o item não existe o resultado é -1
		
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());//vai filtrar e imprimir uma nova lista com a letra que gostaria
		for (String x : result) {
			System.out.println(x);
			}
		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);//procura o primeiro elemento com a letra que desejar se não for encontrado ele retorna null
	}
}
