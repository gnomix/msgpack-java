package org.msgpack.template.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;
import org.msgpack.MessagePack;
import org.msgpack.packer.Packer;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.template.Template;
import org.msgpack.testclasses.AbstractClass;
import org.msgpack.testclasses.FinalClass;
import org.msgpack.testclasses.InheritanceClass;
import org.msgpack.testclasses.InheritanceClassNotNullable;
import org.msgpack.testclasses.Interface;
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
import org.msgpack.unpacker.Unpacker;


public class TestReflectionBeansPackStreamUnpack extends TestSet {

    @Test @Override
    public void testPrimitiveTypeFieldsClass() throws Exception {
	super.testPrimitiveTypeFieldsClass();
    }

    @Override
    public void testPrimitiveTypeFieldsClass(PrimitiveTypeFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<PrimitiveTypeFieldsClass> tmpl = builder.buildTemplate(PrimitiveTypeFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	PrimitiveTypeFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testPrimitiveTypeFieldsClassNotNullable() throws Exception {
	super.testPrimitiveTypeFieldsClassNotNullable();
    }

    @Override
    public void testPrimitiveTypeFieldsClassNotNullable(PrimitiveTypeFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<PrimitiveTypeFieldsClassNotNullable> tmpl = builder.buildTemplate(PrimitiveTypeFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	PrimitiveTypeFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testReferenceTypeFieldsClass() throws Exception {
	super.testReferenceTypeFieldsClass();
    }

    @Override
    public void testReferenceTypeFieldsClass(ReferenceTypeFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<ReferenceTypeFieldsClass> tmpl = builder.buildTemplate(ReferenceTypeFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	ReferenceTypeFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testReferenceTypeFieldsClassNotNullable() throws Exception {
	super.testReferenceTypeFieldsClassNotNullable();
    }

    @Override
    public void testReferenceTypeFieldsClassNotNullable(ReferenceTypeFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<ReferenceTypeFieldsClassNotNullable> tmpl = builder.buildTemplate(ReferenceTypeFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	ReferenceTypeFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testListTypeFieldsClass() throws Exception {
	super.testListTypeFieldsClass();
    }

    @Override
    public void testListTypeFieldsClass(ListTypeFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<ListTypeFieldsClass> tmpl = builder.buildTemplate(ListTypeFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	ListTypeFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testListTypeFieldsClassNotNullable() throws Exception {
	super.testListTypeFieldsClassNotNullable();
    }

    @Override
    public void testListTypeFieldsClassNotNullable(ListTypeFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<ListTypeFieldsClassNotNullable> tmpl = builder.buildTemplate(ListTypeFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	ListTypeFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testMapTypeFieldsClass() throws Exception {
	super.testMapTypeFieldsClass();
    }

    @Override
    public void testMapTypeFieldsClass(MapTypeFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<MapTypeFieldsClass> tmpl = builder.buildTemplate(MapTypeFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	MapTypeFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testMapTypeFieldsClassNotNullable() throws Exception {
	super.testMapTypeFieldsClassNotNullable();
    }

    @Override
    public void testMapTypeFieldsClassNotNullable(MapTypeFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<MapTypeFieldsClassNotNullable> tmpl = builder.buildTemplate(MapTypeFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	MapTypeFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testFinalClass() throws Exception {
	super.testFinalClass();
    }

    @Override
    public void testFinalClass(FinalClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<FinalClass> tmpl = builder.buildTemplate(FinalClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	FinalClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testAbstractClass() throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	try {
	    builder.buildTemplate(AbstractClass.class);
	} catch (Throwable t) {
	    assertTrue(t instanceof TemplateBuildException);
	}
    }

    @Test @Override
    public void testInterface() throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	try {
	    builder.buildTemplate(Interface.class);
	    fail();
	} catch (Throwable t) {
	    assertTrue(t instanceof TemplateBuildException);
	}
    }

    @Test @Override
    public void testModifiersFieldsClass() throws Exception {
	super.testModifiersFieldsClass();
    }

    @Override
    public void testModifiersFieldsClass(ModifiersFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<ModifiersFieldsClass> tmpl = builder.buildTemplate(ModifiersFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	ModifiersFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testModifiersFieldsClassNotNullable() throws Exception {
	super.testModifiersFieldsClassNotNullable();
    }

    @Override
    public void testModifiersFieldsClassNotNullable(ModifiersFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<ModifiersFieldsClassNotNullable> tmpl = builder.buildTemplate(ModifiersFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	ModifiersFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testUserDefinedTypeFieldsClass() throws Exception {
	super.testUserDefinedTypeFieldsClass();
    }

    @Override
    public void testUserDefinedTypeFieldsClass(UserDefinedTypeFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<UserDefinedTypeFieldsClass> tmpl = builder.buildTemplate(UserDefinedTypeFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	UserDefinedTypeFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testUserDefinedTypeFieldsClassNotNullable() throws Exception {
	super.testUserDefinedTypeFieldsClassNotNullable();
    }

    @Override
    public void testUserDefinedTypeFieldsClassNotNullable(UserDefinedTypeFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<UserDefinedTypeFieldsClassNotNullable> tmpl = builder.buildTemplate(UserDefinedTypeFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	UserDefinedTypeFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testInheritanceClass() throws Exception {
	super.testInheritanceClass();
    }

    @Override
    public void testInheritanceClass(InheritanceClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<InheritanceClass> tmpl = builder.buildTemplate(InheritanceClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	InheritanceClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testInheritanceClassNotNullable() throws Exception {
	super.testInheritanceClassNotNullable();
    }

    @Override
    public void testInheritanceClassNotNullable(InheritanceClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<InheritanceClassNotNullable> tmpl = builder.buildTemplate(InheritanceClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	InheritanceClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testMessagePackableTypeFieldsClass() throws Exception {
	super.testMessagePackableTypeFieldsClass();
    }

    @Override
    public void testMessagePackableTypeFieldsClass(MessagePackableTypeFieldsClass v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<MessagePackableTypeFieldsClass> tmpl = builder.buildTemplate(MessagePackableTypeFieldsClass.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	MessagePackableTypeFieldsClass ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

    @Test @Override
    public void testMessagePackableTypeFieldsClassNotNullable() throws Exception {
	super.testMessagePackableTypeFieldsClassNotNullable();
    }

    @Override
    public void testMessagePackableTypeFieldsClassNotNullable(MessagePackableTypeFieldsClassNotNullable v) throws Exception {
	TemplateRegistry registry = new TemplateRegistry();
	ReflectionBeansTemplateBuilder builder = new ReflectionBeansTemplateBuilder(registry);
	Template<MessagePackableTypeFieldsClassNotNullable> tmpl = builder.buildTemplate(MessagePackableTypeFieldsClassNotNullable.class);
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	Packer packer = new MessagePack().createPacker(out);
	tmpl.write(packer, v);
	byte[] bytes = out.toByteArray();
	Unpacker unpacker = new MessagePack().createUnpacker(new ByteArrayInputStream(bytes));
	MessagePackableTypeFieldsClassNotNullable ret = tmpl.read(unpacker, null);
	assertEquals(v, ret);
    }

}