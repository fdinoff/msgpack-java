package org.msgpack.template.builder;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.msgpack.MessageTypeException;
import org.msgpack.testclasses.EnumTypeFieldsClass;
import org.msgpack.testclasses.EnumTypeFieldsClassNotNullable;
import org.msgpack.testclasses.FinalClass;
import org.msgpack.testclasses.InheritanceClass;
import org.msgpack.testclasses.InheritanceClassNotNullable;
import org.msgpack.testclasses.ListTypeFieldsClass;
import org.msgpack.testclasses.ListTypeFieldsClassNotNullable;
import org.msgpack.testclasses.MapTypeFieldsClass;
import org.msgpack.testclasses.MapTypeFieldsClassNotNullable;
import org.msgpack.testclasses.MessagePackableTypeFieldsClass;
import org.msgpack.testclasses.MessagePackableTypeFieldsClassNotNullable;
import org.msgpack.testclasses.ModifiersFieldsClass;
import org.msgpack.testclasses.ModifiersFieldsClassNotNullable;
import org.msgpack.testclasses.PrimitiveTypeFieldsClass;
import org.msgpack.testclasses.PrimitiveTypeFieldsClassNotNullable;
import org.msgpack.testclasses.ReferenceTypeFieldsClass;
import org.msgpack.testclasses.ReferenceTypeFieldsClassNotNullable;
import org.msgpack.testclasses.UserDefinedTypeFieldsClass;
import org.msgpack.testclasses.UserDefinedTypeFieldsClassNotNullable;


@Ignore
public class TestSet {
    public static byte[] toByteArray(ByteBuffer from) {
	byte[] bytes = new byte[from.remaining()];
	from.get(bytes, from.arrayOffset() + from.position(), from.remaining());
	return bytes;
    }

    public void testPrimitiveTypeFieldsClass() throws Exception {
	testPrimitiveTypeFieldsClass(null);
	testPrimitiveTypeFieldsClass(new PrimitiveTypeFieldsClass());
	PrimitiveTypeFieldsClass v = new PrimitiveTypeFieldsClass();
        v.f0 = (byte) 0;
        v.f1 = 1;
        v.f2 = 2;
        v.f3 = 3;
        v.f4 = 4;
        v.f5 = 5;
        v.f6 = false;
        testPrimitiveTypeFieldsClass(v);
    }

    public void testPrimitiveTypeFieldsClass(PrimitiveTypeFieldsClass v) throws Exception {
    }

    public void testPrimitiveTypeFieldsClassNotNullable() throws Exception {
	testPrimitiveTypeFieldsClassNotNullable(null);
	testPrimitiveTypeFieldsClassNotNullable(new PrimitiveTypeFieldsClassNotNullable());
	PrimitiveTypeFieldsClassNotNullable v = new PrimitiveTypeFieldsClassNotNullable();
	v.f0 = (byte) 0;
        v.f1 = 1;
        v.f2 = 2;
        v.f3 = 3;
        v.f4 = 4;
        v.f5 = 5;
        v.f6 = false;
        testPrimitiveTypeFieldsClassNotNullable(v);
    }

    public void testPrimitiveTypeFieldsClassNotNullable(PrimitiveTypeFieldsClassNotNullable v) throws Exception {
    }

    public void testReferenceTypeFieldsClass() throws Exception {
	testReferenceTypeFieldsClass(null);
	testReferenceTypeFieldsClass(new ReferenceTypeFieldsClass());
	ReferenceTypeFieldsClass v = new ReferenceTypeFieldsClass();
        v.f0 = 0;
        v.f1 = 1;
        v.f2 = 2;
        v.f3 = (long) 3;
        v.f4 = (float) 4;
        v.f5 = (double) 5;
        v.f6 = false;
        v.f7 = new BigInteger("7");
        v.f8 = "8";
        v.f9 = new byte[] { 0x01, 0x02 };
        v.f10 = ByteBuffer.wrap("muga".getBytes());
        testReferenceTypeFieldsClass(v);
    }

    public void testReferenceTypeFieldsClass(ReferenceTypeFieldsClass v) throws Exception {
    }

    public void testReferenceTypeFieldsClassNotNullable() throws Exception {
	testReferenceTypeFieldsClassNotNullable(null);
	try {
	    testReferenceTypeFieldsClassNotNullable(new ReferenceTypeFieldsClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	ReferenceTypeFieldsClassNotNullable v = new ReferenceTypeFieldsClassNotNullable();
        v.f0 = 0;
        v.f1 = 1;
        v.f2 = 2;
        v.f3 = (long) 3;
        v.f4 = (float) 4;
        v.f5 = (double) 5;
        v.f6 = false;
        v.f7 = new BigInteger("7");
        v.f8 = "8";
        v.f9 = new byte[] { 0x01, 0x02 };
        v.f10 = ByteBuffer.wrap("muga".getBytes());
        testReferenceTypeFieldsClassNotNullable(v);
    }

    public void testReferenceTypeFieldsClassNotNullable(ReferenceTypeFieldsClassNotNullable v) throws Exception {
    }

    public void testListTypeFieldsClass() throws Exception {
	testListTypeFieldsClass(null);
	testListTypeFieldsClass(new ListTypeFieldsClass());
	ListTypeFieldsClass v = new ListTypeFieldsClass();
        v.f0 = new ArrayList<Integer>();
        v.f1 = new ArrayList<Integer>();
        v.f1.add(1);
        v.f1.add(2);
        v.f1.add(3);
        v.f2 = new ArrayList<String>();
        v.f2.add("e1");
        v.f2.add("e2");
        v.f2.add("e3");
        v.f3 = new ArrayList<List<String>>();
        v.f3.add(v.f2);
        v.f4 = new ArrayList<ListTypeFieldsClass.NestedClass>();
        ListTypeFieldsClass.NestedClass nested = new ListTypeFieldsClass.NestedClass();
        nested.f0 = new byte[] { 0x01, 0x02 };
        nested.f1 = "muga";
        v.f4.add(nested);
        v.f5 = new ArrayList<ByteBuffer>();
        v.f5.add(ByteBuffer.wrap("e1".getBytes()));
        v.f5.add(ByteBuffer.wrap("e2".getBytes()));
        v.f5.add(ByteBuffer.wrap("e3".getBytes()));
	testListTypeFieldsClass(v);
    }

    public void testListTypeFieldsClass(ListTypeFieldsClass v) throws Exception {
    }

    public void testListTypeFieldsClassNotNullable() throws Exception {
	testListTypeFieldsClassNotNullable(null);
	try {
	    testListTypeFieldsClassNotNullable(new ListTypeFieldsClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	ListTypeFieldsClassNotNullable v = new ListTypeFieldsClassNotNullable();
        v.f0 = new ArrayList<Integer>();
        v.f1 = new ArrayList<Integer>();
        v.f1.add(1);
        v.f1.add(2);
        v.f1.add(3);
        v.f2 = new ArrayList<String>();
        v.f2.add("e1");
        v.f2.add("e2");
        v.f2.add("e3");
        v.f3 = new ArrayList<List<String>>();
        v.f3.add(v.f2);
        v.f4 = new ArrayList<ListTypeFieldsClassNotNullable.NestedClass>();
        ListTypeFieldsClassNotNullable.NestedClass nested = new ListTypeFieldsClassNotNullable.NestedClass();
        nested.f0 = new byte[] { 0x01, 0x02 };
        nested.f1 = "muga";
        v.f4.add(nested);
        v.f5 = new ArrayList<ByteBuffer>();
        v.f5.add(ByteBuffer.wrap("e1".getBytes()));
        v.f5.add(ByteBuffer.wrap("e2".getBytes()));
        v.f5.add(ByteBuffer.wrap("e3".getBytes()));
	testListTypeFieldsClassNotNullable(v);
    }

    public void testListTypeFieldsClassNotNullable(ListTypeFieldsClassNotNullable v) throws Exception {
    }

    public void testMapTypeFieldsClass() throws Exception {
	testMapTypeFieldsClass(null);
	testMapTypeFieldsClass(new MapTypeFieldsClass());
	MapTypeFieldsClass v = new MapTypeFieldsClass();
        v.f0 = new HashMap<Integer, Integer>();
        v.f1 = new HashMap<Integer, Integer>();
        v.f1.put(1, 1);
        v.f1.put(2, 2);
        v.f1.put(3, 3);
        v.f2 = new HashMap<String, Integer>();
        v.f2.put("k1", 1);
        v.f2.put("k2", 2);
        v.f2.put("k3", 3);
        v.f3 = new HashMap<String, MapTypeFieldsClass.NestedClass>();
        MapTypeFieldsClass.NestedClass nested = new MapTypeFieldsClass.NestedClass();
        nested.f0 = "muga";
        v.f3.put("muga", nested);
        testMapTypeFieldsClass(v);
    }

    public void testMapTypeFieldsClass(MapTypeFieldsClass v) throws Exception {
    }

    public void testMapTypeFieldsClassNotNullable() throws Exception {
	testMapTypeFieldsClass(null);
	try {
	    testMapTypeFieldsClassNotNullable(new MapTypeFieldsClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	MapTypeFieldsClassNotNullable v = new MapTypeFieldsClassNotNullable();
        v.f0 = new HashMap<Integer, Integer>();
        v.f1 = new HashMap<Integer, Integer>();
        v.f1.put(1, 1);
        v.f1.put(2, 2);
        v.f1.put(3, 3);
        v.f2 = new HashMap<String, Integer>();
        v.f2.put("k1", 1);
        v.f2.put("k2", 2);
        v.f2.put("k3", 3);
        v.f3 = new HashMap<String, MapTypeFieldsClassNotNullable.NestedClass>();
        MapTypeFieldsClassNotNullable.NestedClass nested = new MapTypeFieldsClassNotNullable.NestedClass();
        nested.f0 = "muga";
        v.f3.put("muga", nested);
        testMapTypeFieldsClassNotNullable(v);
    }

    public void testMapTypeFieldsClassNotNullable(MapTypeFieldsClassNotNullable v) throws Exception {
    }

    public void testFinalClass() throws Exception {
	testFinalClass(null);
	testFinalClass(new FinalClass());
	FinalClass v = new FinalClass();
	v.f0 = 10;
	v.f1 = "muga";
	testFinalClass(v);
    }

    public void testFinalClass(FinalClass v) throws Exception {
    }

    public void testAbstractClass() throws Exception {
    }

    public void testInterface() throws Exception {
    }

    public void testEnumTypeFieldsClass() throws Exception {
	testEnumTypeFieldsClass(null);
	testEnumTypeFieldsClass(new EnumTypeFieldsClass());
	EnumTypeFieldsClass v = new EnumTypeFieldsClass();
	v.f0 = 0;
	v.f1 = EnumTypeFieldsClass.SampleEnum.ONE;
	testEnumTypeFieldsClass(v);
    }

    public void testEnumTypeFieldsClass(EnumTypeFieldsClass v) throws Exception {
    }

    public void testEnumTypeFieldsClassNotNullable() throws Exception {
	testEnumTypeFieldsClassNotNullable(null);
	try {
	    testEnumTypeFieldsClassNotNullable(new EnumTypeFieldsClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	EnumTypeFieldsClassNotNullable v = new EnumTypeFieldsClassNotNullable();
	v.f0 = 0;
	v.f1 = EnumTypeFieldsClassNotNullable.SampleEnum.ONE;
	testEnumTypeFieldsClassNotNullable(v);
    }

    public void testEnumTypeFieldsClassNotNullable(EnumTypeFieldsClassNotNullable v) throws Exception {
    }

    public void testModifiersFieldsClass() throws Exception {
	testModifiersFieldsClass(null);
	testModifiersFieldsClass(new ModifiersFieldsClass());
	ModifiersFieldsClass v = new ModifiersFieldsClass();
	v.f0 = 0;
	testModifiersFieldsClass(v);
    }

    public void testModifiersFieldsClass(ModifiersFieldsClass v) throws Exception {
    }

    public void testModifiersFieldsClassNotNullable() throws Exception {
	testModifiersFieldsClassNotNullable(null);
	testModifiersFieldsClassNotNullable(new ModifiersFieldsClassNotNullable());
	ModifiersFieldsClassNotNullable v = new ModifiersFieldsClassNotNullable();
	v.f0 = 0;
	testModifiersFieldsClassNotNullable(v);
    }

    public void testModifiersFieldsClassNotNullable(ModifiersFieldsClassNotNullable v) throws Exception {
    }

    public void testUserDefinedTypeFieldsClass() throws Exception {
	testUserDefinedTypeFieldsClass(null);
	testUserDefinedTypeFieldsClass(new UserDefinedTypeFieldsClass());
	UserDefinedTypeFieldsClass v = new UserDefinedTypeFieldsClass();
	v.f0 = new UserDefinedTypeFieldsClass.NestedClass1();
	v.f0.f0 = 0;
	v.f0.f1 = "muga";
	v.f1 = new UserDefinedTypeFieldsClass.NestedClass2();
	v.f1.f0 = 0;
	v.f1.f1 = "nishizawa";
	testUserDefinedTypeFieldsClass(v);
    }

    public void testUserDefinedTypeFieldsClass(UserDefinedTypeFieldsClass v) throws Exception {
    }

    public void testUserDefinedTypeFieldsClassNotNullable() throws Exception {
	testUserDefinedTypeFieldsClassNotNullable(null);
	try {
	    testUserDefinedTypeFieldsClassNotNullable(new UserDefinedTypeFieldsClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	UserDefinedTypeFieldsClassNotNullable v = new UserDefinedTypeFieldsClassNotNullable();
	v.f0 = new UserDefinedTypeFieldsClassNotNullable.NestedClass1();
	v.f0.f0 = 0;
	v.f0.f1 = "muga";
	v.f1 = new UserDefinedTypeFieldsClassNotNullable.NestedClass2();
	v.f1.f0 = 0;
	v.f1.f1 = "nishizawa";
	testUserDefinedTypeFieldsClassNotNullable(v);
    }

    public void testUserDefinedTypeFieldsClassNotNullable(UserDefinedTypeFieldsClassNotNullable v) throws Exception {
    }

    public void testInheritanceClass() throws Exception {
	testInheritanceClass(null);
	testInheritanceClass(new InheritanceClass());
	InheritanceClass v = new InheritanceClass();
	v.f0 = "muga";
	v.f1 = "furuhashi";
	v.f2 = 10;
	testInheritanceClass(v);
    }

    public void testInheritanceClass(InheritanceClass v) throws Exception {
    }

    public void testInheritanceClassNotNullable() throws Exception {
	testInheritanceClassNotNullable(null);
	try {
	    testInheritanceClassNotNullable(new InheritanceClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	InheritanceClassNotNullable v = new InheritanceClassNotNullable();
	v.f0 = "muga";
	v.f1 = "furuhashi";
	v.f2 = 10;
	testInheritanceClassNotNullable(v);
    }

    public void testInheritanceClassNotNullable(InheritanceClassNotNullable v) throws Exception {
    }

    public void testMessagePackableTypeFieldsClass() throws Exception {
	testMessagePackableTypeFieldsClass(null);
	testMessagePackableTypeFieldsClass(new MessagePackableTypeFieldsClass());
	MessagePackableTypeFieldsClass v = new MessagePackableTypeFieldsClass();
	v.f0 = "muga";
	v.f1 = new MessagePackableTypeFieldsClass.NestedClass();
	v.f1.f0 = "nishizawa";
	v.f1.f1 = new int[] { 1, 2, 3 };
	v.f1.f2 = new ArrayList<String>();
	v.f1.f2.add("muga");
	v.f1.f2.add("frsyuki");
	v.f1.f2.add("msgpack");
	testMessagePackableTypeFieldsClass(v);
    }

    public void testMessagePackableTypeFieldsClass(MessagePackableTypeFieldsClass v) throws Exception {
    }

    public void testMessagePackableTypeFieldsClassNotNullable() throws Exception {
	testMessagePackableTypeFieldsClassNotNullable(null);
	try {
	    testMessagePackableTypeFieldsClassNotNullable(new MessagePackableTypeFieldsClassNotNullable());
	    Assert.fail();
	} catch (Throwable t) {
	    Assert.assertTrue(t instanceof MessageTypeException);
	}
	MessagePackableTypeFieldsClassNotNullable v = new MessagePackableTypeFieldsClassNotNullable();
	v.f0 = "muga";
	v.f1 = new MessagePackableTypeFieldsClassNotNullable.NestedClass();
	v.f1.f0 = "nishizawa";
	v.f1.f1 = new int[] { 1, 2, 3 };
	v.f1.f2 = new ArrayList<String>();
	v.f1.f2.add("muga");
	v.f1.f2.add("frsyuki");
	v.f1.f2.add("msgpack");
	testMessagePackableTypeFieldsClassNotNullable(v);
    }

    public void testMessagePackableTypeFieldsClassNotNullable(MessagePackableTypeFieldsClassNotNullable v) throws Exception {
    }
}
