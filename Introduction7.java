public class Introduction7 {
	public static void main( String[] args ) {
		for( int i=1; i<10; i++ ) {
			for( int j=1; j<10; j++ ) {
				if( i>=j ) {
					System.out.printf( "%3d", i*j );
				} else {
					System.out.print( "   " );
				}
			}
			System.out.println();
		}
	}
}
