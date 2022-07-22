package q1;

import java.util.Set;
import java.util.TreeSet;

class Emp implements Comparable<Emp>{
	int id;

	public Emp(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Emp o) {
		return Integer.compare(this.getId(), o.getId());
	}

}

public class DemoTreeSet {
	
	public static void main(String[] args) {
		Set<Emp> emps=new TreeSet<>();
		emps.add(new Emp(12));
		emps.add(new Emp(56));
		System.out.println(emps.size());
	}

}














