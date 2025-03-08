package learning;

public class J_011_DataTypeConversion {
	
	
	public static void main(String [] args) {
		
		/*
	 	The size of :
	 	boolean	is 1-bit   = 1-bit
	 	byte	is 1-byte  = 8-bits i.e., combination of 8 - 0's and 1's .
	 	short	is 2-byte  = 16-bits
	 	char 	is 2-byte  = 16-bits
	 	int 	is 4-byte  = 32-bits
	 	long 	is 8-byte  = 64-bits
	 	float 	is 4-byte  = 32-bits
	 	double	is 8-byte  = 64-bits
	 	
	 	
	 	So, the conversion of data-types having small size into data-type having larger 
	 	size is automatically done by compiler.
	 	Like :
	 	byte b = 34 ;
	 	int i = b ;
	 	long l = b;
	 	double d = b;
	 	
	 	But, the conversion of data-types having large size into data-types having small
	 	size does not takes place automatically and shows error of type mismatch.
	 	But, we can perform such conversions by forcing the compiler for type casting.
	 	This is knows as Type Casting.
	 	
	 	- Widening Casting (automatically or implicit casting) - converting a 
	 		smaller type to a larger type size. 
	 		byte -> short -> char -> int -> long -> float -> double.
		
		- Narrowing Casting (manually or explicit casting) - converting a 
			larger type to a smaller size type. 
			double -> float -> long -> int -> char -> short -> byte.
	 	
	 	Always remember :
	 	- if a method of class is having a return type of double(large size), then, 
	 		it can 'return' an integer/float/byte/short value (small size data-type).
	 	- but, if a method of a class is having a return type of int (small size), then, 
	 		in cannot 'return' any large size variable like double of long.
	*/
	
	System.out.println("size of Byte	is " + Byte.SIZE/8 + " bytes");
	System.out.println("size of Short	is " + Short.SIZE/8 + " bytes");
	System.out.println("size of Char 	is " + Character.SIZE/8 + " bytes");
	System.out.println("size of Int 	is " + Integer.SIZE/8 + " bytes");
	System.out.println("size of Long	is " + Long.SIZE/8 + " bytes");
	System.out.println("size of Float 	is " + Float.SIZE/8 + " bytes");
	System.out.println("size of Double	is " + Double.SIZE/8 + " bytes");
	
	
	byte b1 = 34 ;
	short s1 = (short) b1 ;
	char c1 = (char) b1 ;
	int i1 = (int) b1 ;
	long l1 = (long) b1 ;
	float j1 = (float) b1 ;
	double d1 = (double) b1 ;
	String str1 = String.valueOf(b1) ;
	Integer int1 = Integer.valueOf(b1) ;
	
	short s2 = 34 ;
	byte b2 = (byte) s2 ;
	char c2 = (char) s2 ;
	int i2 = (int) s2 ;
	long l2 = (long) s2 ;
	float f2 = (long) s2 ;
	double d2 = (double) s2 ;
	String str2 = String.valueOf(s2) ;
	Integer int2 = Integer.valueOf(s2) ;
	
	char c3 = 'a' ;
	byte b3 = (byte) c3 ;
	short s3 = (short) c3 ;
	int i3 = (int) c3 ;
	long l3 = (long) c3 ;
	float f3 = (float) c3 ;
	double d3 = (double) c3 ;
	String str3 = String.valueOf(c3) ;
	Integer int3 = Integer.valueOf(c3) ;
	
	int i4 = 34 ;
	byte b4 = (byte) i4 ;
	short s4 = (short) i4 ;
	char c4 = (char) i4 ;
	long l4 = (long) i4 ;
	float f4 = (float) i4 ;
	double d4 = (double) i4 ;
	String str4 = String.valueOf(i4) ;
	Integer int4 = Integer.valueOf(i4) ;
	
	long l5 = 34 ;
	byte b5 = (byte) l5 ;
	short s5 = (short) l5 ;
	char c5 = (char) l5 ;
	int i5 = (int) l5 ;
	float f5 = (float) l5 ;
	double d5 = (double) l5 ;
	String str5 = String.valueOf(l5) ;
	Integer int5 = Integer.valueOf(i5) ;
	
	float f6 = 34f ;
	byte b6 = (byte) f6 ;
	short s6 = (short) f6 ;
	char c6 = (char) f6 ;
	int i6 = (int) f6 ;
	long l6 = (long) f6 ;
	double d6 = (double) f6 ;
	String str6 = String.valueOf(f6) ;
	Integer int6 = Integer.valueOf((int)f6) ;
	
	double d7 = 34d;
	byte b7 = (byte) d7 ;
	short s7 = (short) d7 ;
	int i7 = (int) d7 ;
	char c7 = (char) d7;
	long l7 = (long) d7 ;
	float f7 = (float) d7 ;
	String str7 = String.valueOf(d7) ;
	Integer int7 = Integer.valueOf((int) d7) ;
	
	String str8 = "34" ;
	byte b8 = Byte.valueOf(str8) ;
	short s8 = Short.valueOf(str8) ;
	int i8 = Integer.valueOf(str8) ;
	long l8 = Long.valueOf(str8) ;
	float f8 = Float.valueOf(str8) ;
	double d8 = Double.valueOf(str8) ;
	Integer int8 = Integer.valueOf(str8) ;
	
	Byte b9 = 34 ;
	Short s9 = Short.valueOf(b8) ;
	Integer int9 = Integer.valueOf(b9) ;
	String str9 = String.valueOf(b9) ;
	Long l9 = Long.valueOf(b9) ;
	Float f9 = Float.valueOf(b9) ;
	Double d9 = Double.valueOf(b9) ;
	
//	Autoboxing of Wrapper Class :-
//	--------------------------------------------------
//	Autoboxing means conversion of Wrapper Class into Primitive Type and it happens automatically.
	
	Boolean bool1 = true ;
	Byte byte1 = 34 ;
	Short short1 = 34 ;
	Integer integer1 = 34 ;
	String string1 = "34" ;
	Long long1 = 34l ;
	Float float1 = 34f ;
	Double double1 = 34d ;
	
	//	conversion:
	boolean bool2 = bool1 ;
	byte byte2 = byte1 ;
	short short2 = short1 ;
	int integer2 = integer1 ;
	String string2 = string1 ;
	long long2 = long1 ;
	float float2 = float1 ;
	double double2 = double1 ;
	
	
//	Unboxing of wrapper class
//	-------------------------------------
//	Unboxing means conversion of Primitive Type into Wrapper Class, and It can be done Using the methods of that Wrapper Class.
	
	boolean bool3 = true ;
	byte byte3 = 34 ;
	short short3 = 34 ;
	int integer3 = 34 ;
	long long3 = 34l ;
	float float3 = 34f ;
	double double3 = 34d ;
	
	Boolean boolean4 = Boolean.valueOf(bool3) ;
	Byte byte4 = Byte.valueOf(byte3) ;
	Short short4 = Short.valueOf(short3) ;
	Integer integer4 = Integer.valueOf(integer3) ;
	Long long4 = Long.valueOf(long3) ;
	Float float4 = Float.valueOf(float3) ;
	Double double4 = Double.valueOf(double3) ;
	
	
	}
}
