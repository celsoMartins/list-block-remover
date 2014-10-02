import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Executor {

	public static void main(String[] args) {
		
		final Element oneElement = new Element(1L, "Elemento 1");
		final Element otherElement = new Element(2L, "Elemento 2");
		final Element thirdElement = new Element(3L, "Elemento 1");
		
		Element[] elements = new Element[]{oneElement, otherElement, thirdElement};
		
		List<Element> listaDeElements = new ArrayList<Element>(Arrays.asList(elements));
		
		System.out.println(listaDeElements.size());
		listaDeElements.removeAll(new ArrayList<Element>(Arrays.asList(oneElement)));
		System.out.println(listaDeElements.size());
	}
}
