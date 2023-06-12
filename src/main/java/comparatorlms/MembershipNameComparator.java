package comparatorlms;

import java.util.Comparator;

import getsetlms.Membership;

public class MembershipNameComparator implements Comparator<Membership> {

	public int compare(Membership m1, Membership m2) {
		return m1.getName().compareTo(m2.getName());

	}
}
