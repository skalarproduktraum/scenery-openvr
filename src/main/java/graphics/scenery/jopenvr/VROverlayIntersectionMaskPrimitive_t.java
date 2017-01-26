package graphics.scenery.jopenvr;
import com.ochafik.lang.jnaerator.runtime.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VROverlayIntersectionMaskPrimitive_t extends Structure<VROverlayIntersectionMaskPrimitive_t, VROverlayIntersectionMaskPrimitive_t.ByValue, VROverlayIntersectionMaskPrimitive_t.ByReference > {
	/** @see EVROverlayIntersectionMaskPrimitiveType */
	public int m_nPrimitiveType;
	public VROverlayIntersectionMaskPrimitive_Data_t m_Primitive;
	public VROverlayIntersectionMaskPrimitive_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("m_nPrimitiveType", "m_Primitive");
	}
	public VROverlayIntersectionMaskPrimitive_t(int m_nPrimitiveType, VROverlayIntersectionMaskPrimitive_Data_t m_Primitive) {
		super();
		this.m_nPrimitiveType = m_nPrimitiveType;
		this.m_Primitive = m_Primitive;
	}
	public VROverlayIntersectionMaskPrimitive_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected VROverlayIntersectionMaskPrimitive_t newInstance() { return new VROverlayIntersectionMaskPrimitive_t(); }
	public static VROverlayIntersectionMaskPrimitive_t[] newArray(int arrayLength) {
		return Structure.newArray(VROverlayIntersectionMaskPrimitive_t.class, arrayLength);
	}
	public static class ByReference extends VROverlayIntersectionMaskPrimitive_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VROverlayIntersectionMaskPrimitive_t implements Structure.ByValue {
		
	};
}
