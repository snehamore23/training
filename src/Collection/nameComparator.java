package Collection;

import java.util.Comparator;

public class nameComparator implements Comparator<PriorityComparator> {


	@Override
	public int compare(PriorityComparator o1, PriorityComparator o2) {

		return o1.name.compareTo(o2.name) ;
	}

}
