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
public class RenderModel_TextureMap_t extends Structure<RenderModel_TextureMap_t, RenderModel_TextureMap_t.ByValue, RenderModel_TextureMap_t.ByReference > {
	public short unWidth;
	public short unHeight;
	/** const uint8_t * */
	public Pointer rubTextureMapData;
	public RenderModel_TextureMap_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("unWidth", "unHeight", "rubTextureMapData");
	}
	public RenderModel_TextureMap_t(short unWidth, short unHeight, Pointer rubTextureMapData) {
		super();
		this.unWidth = unWidth;
		this.unHeight = unHeight;
		this.rubTextureMapData = rubTextureMapData;
	}
	public RenderModel_TextureMap_t(Pointer peer) {
		super(peer);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected RenderModel_TextureMap_t newInstance() { return new RenderModel_TextureMap_t(); }
	public static RenderModel_TextureMap_t[] newArray(int arrayLength) {
		return Structure.newArray(RenderModel_TextureMap_t.class, arrayLength);
	}
	public static class ByReference extends RenderModel_TextureMap_t implements Structure.ByReference {
		
	};
	public static class ByValue extends RenderModel_TextureMap_t implements Structure.ByValue {
		
	};
}
