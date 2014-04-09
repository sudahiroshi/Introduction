public class Introduction4 {
	public static void main( String[] args ) {
		System.out.print( "   " );
		for( int j=1; j<10; j++ ) {
			System.out.printf( "%3d", j );
		}
		System.out.println();
		for( int j=1; j<31; j++ ) {
			System.out.print( "-" );
		}
		System.out.println();
		for( int i=1; i<10; i++ ) {
			System.out.print( i + " |" );
			for( int j=1; j<10; j++ ) {
				System.out.printf( "%3d", i*j );
			}
			System.out.println();
		}
	}
}
