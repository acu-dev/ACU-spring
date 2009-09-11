package edu.acu.wip.spring.web.servlet.tags.form;

import javax.servlet.jsp.JspException;

import org.springframework.web.servlet.tags.form.TagWriter;

public class InputTag extends
		org.springframework.web.servlet.tags.form.InputTag {
	private static final long serialVersionUID = 1799253252315901997L;

	public static final String AUTOCAPITALIZE_ATTRIBUTE = "autocapitalize";
	public static final String AUTOCORRECT_ATTRIBUTE = "autocorrect";
	
	private String autocapitalize;
	private String autocorrect;
	public String getAutocapitalize() {
		return autocapitalize;
	}
	public void setAutocapitalize(String autocapitalize) {
		this.autocapitalize = autocapitalize;
	}
	public String getAutocorrect() {
		return autocorrect;
	}
	public void setAutocorrect(String autocorrect) {
		this.autocorrect = autocorrect;
	}
	
	@Override
	protected int writeTagContent(TagWriter tagWriter) throws JspException {
		tagWriter.startTag("input");

		writeDefaultAttributes(tagWriter);
		tagWriter.writeAttribute("type", getType());
		writeValue(tagWriter);

		// custom optional attributes
		writeOptionalAttribute(tagWriter, SIZE_ATTRIBUTE, getSize());
		writeOptionalAttribute(tagWriter, MAXLENGTH_ATTRIBUTE, getMaxlength());
		writeOptionalAttribute(tagWriter, ALT_ATTRIBUTE, getAlt());
		writeOptionalAttribute(tagWriter, ONSELECT_ATTRIBUTE, getOnselect());
		writeOptionalAttribute(tagWriter, AUTOCOMPLETE_ATTRIBUTE, getAutocomplete());
		writeOptionalAttribute(tagWriter, AUTOCORRECT_ATTRIBUTE, getAutocorrect());
		writeOptionalAttribute(tagWriter, AUTOCAPITALIZE_ATTRIBUTE, getAutocapitalize());

		tagWriter.endTag();
		return SKIP_BODY;
	}

}
