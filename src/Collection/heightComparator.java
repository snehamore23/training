package Collection;

import java.util.Comparator;

public class heightComparator implements Comparator<PriorityComparator> {

@Override
public int compare(PriorityComparator o1, PriorityComparator o2) {
	// TODO Auto-generated method stub
	return o1.height-o2.height;
}
}
