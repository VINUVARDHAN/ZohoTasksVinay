package com.learn.java.Daily;

class CA {
	interface CAI {

	}

	abstract class CAA {

	}

	static abstract class CASA {

	}

	class CAC {

	}
}

abstract class AA {
	interface AAI {

	}

	abstract class AAA {

	}

	class AAC implements IA {

	}
}

interface IA {

	interface IAI {

	}

	abstract class IAA {

	}

	// ** NOTE **
	class IAC {

	}
}

//---------------------------------
class ClassInterfaceAbstract implements IA, IA.IAI, CA.CAI, AA.AAI {
	public static void main(String args[]) {
		CA z1 = new CA();
		CA.CAC z2 = z1.new CAC();
		IA i1;
		// ** NOTE **
		IA.IAC z3 = new IA.IAC();
	}
}
