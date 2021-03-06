package iwb.domain.db;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Immutable;

import iwb.util.GenericUtil;

@Entity
@Immutable
@Table(name = "W5_FORM_CELL",schema="iwb")
public class W5FormCell implements java.io.Serializable, W5Base, W5Param {
/*TABLE_ID: 41*/

	private static final long serialVersionUID = 1834732724234L;
	
	private int formCellId;
	private int formId;
	private String dsc;
	private String localeMsgKey;
	private String vtype;
	private short controlType;
	private short tabOrder;
	private short xOrder;
	private int formModuleId;
	private short controlWidth;
	private Integer maxLength;
	private short nrdType;//[n]ormal, [r]eadOnly, [d]isabled
	private int lookupQueryId;
	private int dialogGridId;
	private int lookupEditFormId;
	private short sourceType;
	private String defaultValue;
	private short initialSourceType;
	private String initialValue;
	private String extraDefinition;
	private short outFlag;

	private int objectDetailId; // queryParamId, tableFieldId
	private int parentFormCellId; // queryParamId, tableFieldId

	private String lookupIncludedValues;
	private String lookupIncludedParams;

	private short notNullFlag;
	private short activeFlag;

	private Object _sourceObjectDetail;
	private List<W5FormCellProperty> _formCellPropertyList;

	
	@Id
	@Column(name = "FORM_CELL_ID")
	public int getFormCellId() {
		return formCellId;
	}

	public void setFormCellId(int formCellId) {
		this.formCellId = formCellId;
	}

	@Column(name = "FORM_ID")
	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	@Column(name = "DSC")
	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	@Column(name = "LOCALE_MSG_KEY")
	public String getLocaleMsgKey() {
		return localeMsgKey;
	}

	public void setLocaleMsgKey(String localeMsgKey) {
		this.localeMsgKey = localeMsgKey;
	}

	@Column(name = "VTYPE")
	public String getVtype() {
		return vtype;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	@Column(name = "CONTROL_TIP")
	public short getControlType() {
		return controlType;
	}

	public void setControlType(short controlType) {
		this.controlType = controlType;
	}

	@Column(name = "TAB_ORDER")
	public short getTabOrder() {
		return tabOrder;
	}

	public void setTabOrder(short tabOrder) {
		this.tabOrder = tabOrder;
	}

	@Column(name = "CONTROL_WIDTH")
	public short getControlWidth() {
		return controlWidth;
	}

	public void setControlWidth(short controlWidth) {
		this.controlWidth = controlWidth;
	}

	@Column(name = "MAX_LENGTH")
	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	@Column(name = "NRD_TIP")
	public short getNrdType() {
		return nrdType;
	}

	public void setNrdType(short nrdType) {
		this.nrdType = nrdType;
	}

	@Column(name = "LOOKUP_QUERY_ID")
	public int getLookupQueryId() {
		return lookupQueryId;
	}

	public void setLookupQueryId(int lookupQueryId) {
		this.lookupQueryId = lookupQueryId;
	}

	@Column(name = "SOURCE_TIP")
	public short getSourceType() {
		return sourceType;
	}

	public void setSourceType(short sourceType) {
		this.sourceType = sourceType;
	}

	@Column(name = "DEFAULT_VALUE")
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Column(name = "INITIAL_SOURCE_TIP")
	public short getInitialSourceType() {
		return initialSourceType;
	}

	public void setInitialSourceType(short initialSourceType) {
		this.initialSourceType = initialSourceType;
	}

	@Column(name = "INITIAL_VALUE")
	public String getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}

	@Column(name = "EXTRA_DEFINITION")
	public String getExtraDefinition() {
		return extraDefinition;
	}

	public void setExtraDefinition(String extraDefinition) {
		this.extraDefinition = extraDefinition;
	}

	@Column(name = "OBJECT_DETAIL_ID")
	public int getObjectDetailId() {
		return objectDetailId;
	}

	public void setObjectDetailId(int objectDetailId) {
		this.objectDetailId = objectDetailId;
	}

	@Column(name = "LOOKUP_INCLUDED_VALUES")
	public String getLookupIncludedValues() {
		return lookupIncludedValues;
	}

	public void setLookupIncludedValues(String lookupIncludedValues) {
		this.lookupIncludedValues = lookupIncludedValues;
	}

	@Column(name = "LOOKUP_INCLUDED_PARAMS")
	public String getLookupIncludedParams() {
		return lookupIncludedParams;
	}

	public void setLookupIncludedParams(String lookupIncludedParams) {
		this.lookupIncludedParams = lookupIncludedParams;
	}

	@Column(name = "NOT_NULL_FLAG")
	public short getNotNullFlag() {
		return notNullFlag;
	}

	public void setNotNullFlag(short notNullFlag) {
		this.notNullFlag = notNullFlag;
	}

	@Transient
	public Object get_sourceObjectDetail() {
		return _sourceObjectDetail;
	}

	public void set_sourceObjectDetail(Object sourceObjectDetail) {
		_sourceObjectDetail = sourceObjectDetail;
	}
/*
	@Id
	@Column(name = "CUSTOMIZATION_ID")
	public int getCustomizationId() {
		return customizationId;
	}

	public void setCustomizationId(int customizationId) {
		this.customizationId = customizationId;
	}
*/
	@Column(name = "FORM_MODULE_ID")
	public int getFormModuleId() {
		return formModuleId;
	}

	public void setFormModuleId(int formModuleId) {
		this.formModuleId = formModuleId;
	}

	@Column(name = "DIALOG_GRID_ID")
	public int getDialogGridId() {
		return dialogGridId;
	}

	public void setDialogGridId(int dialogGridId) {
		this.dialogGridId = dialogGridId;
	}


	@Column(name = "X_ORDER")
	public short getxOrder() {
		return xOrder;
	}

	public void setxOrder(short xOrder) {
		this.xOrder = xOrder;
	}

	@Column(name = "PARENT_FORM_CELL_ID")
	public int getParentFormCellId() {
		return parentFormCellId;
	}

	public void setParentFormCellId(int parentFormCellId) {
		this.parentFormCellId = parentFormCellId;
	}

	@Column(name = "ACTIVE_FLAG")
	public short getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(short activeFlag) {
		this.activeFlag = activeFlag;
	}
	

	public W5FormCell(int formCellId) {
		super();
		this.formCellId = formCellId;
	}

	public W5FormCell() {
		super();
	}

	@Transient
	public boolean safeEquals(W5Base q) {
		if (q == null)
			return false;
		W5FormCell fc = (W5FormCell) q;
		return this.formCellId == fc.getFormCellId()
				&& GenericUtil.safeEquals(this.dsc, fc.getDsc())
				&& GenericUtil.safeEquals(this.localeMsgKey,
						fc.getLocaleMsgKey())
				&& GenericUtil.safeEquals(this.vtype, fc.getVtype())
				&& this.controlType == fc.getControlType()
				&& this.tabOrder == fc.getTabOrder()
				&& this.xOrder == fc.getxOrder()
				&& this.formModuleId == fc.getFormModuleId()
				&& this.controlWidth == fc.getControlWidth()
				&& this.maxLength == fc.getMaxLength()
				&& this.nrdType == fc.getNrdType()
				&& this.lookupQueryId == fc.getLookupQueryId()
				&& this.dialogGridId == fc.getDialogGridId()
				&& this.sourceType == fc.getSourceType()
				&& GenericUtil.safeEquals(this.defaultValue,
						fc.getDefaultValue())
				&& this.initialSourceType == fc.getInitialSourceType()
				&& GenericUtil.safeEquals(this.initialValue,
						fc.getInitialValue())
				&& GenericUtil.safeEquals(this.extraDefinition,
						fc.getExtraDefinition())
				&&

				this.objectDetailId == fc.getObjectDetailId()
				&& // queryParamId, tableFieldId
				this.parentFormCellId == fc.getParentFormCellId()
				&& // queryParamId, tableFieldId

				GenericUtil.safeEquals(this.lookupIncludedValues,
						fc.getLookupIncludedValues())
				&& GenericUtil.safeEquals(this.lookupIncludedParams,
						fc.getLookupIncludedParams()) &&

				this.notNullFlag == fc.getNotNullFlag()
				&& this.activeFlag == fc.getActiveFlag();

	}
	
	@Column(name = "LOOKUP_EDIT_FORM_ID")
	public int getLookupEditFormId() {
		return lookupEditFormId;
	}

	public void setLookupEditFormId(int lookupEditFormId) {
		this.lookupEditFormId = lookupEditFormId;
	}
	@Transient
	public BigDecimal getMinValue(){
		return null;
	}
	@Transient
	public BigDecimal getMaxValue(){
		return null;
	}
	@Transient
	public Short getMinLength(){
		return null;
	}
	@Transient
	public short getParamType(){
		if(_sourceObjectDetail!=null){
			if(_sourceObjectDetail instanceof W5TableField)return ((W5TableField)_sourceObjectDetail).getFieldType();
			if(_sourceObjectDetail instanceof W5QueryParam)return ((W5QueryParam)_sourceObjectDetail).getParamType();
			if(_sourceObjectDetail instanceof W5GlobalFuncParam)return ((W5GlobalFuncParam)_sourceObjectDetail).getParamType();
		}
		return 0;
	}
	
	private String projectUuid;
	@Id
	@Column(name="project_uuid")
	public String getProjectUuid() {
		return projectUuid;
	}

	public void setProjectUuid(String projectUuid) {
		this.projectUuid = projectUuid;
	}
	@Column(name = "OUT_FLAG")
	public short getOutFlag() {
		return outFlag;
	}

	public void setOutFlag(short outFlag) {
		this.outFlag = outFlag;
	}

	@Transient
	public List<W5FormCellProperty> get_formCellPropertyList() {
		return _formCellPropertyList;
	}

	public void set_formCellPropertyList(List<W5FormCellProperty> _formCellPropertyList) {
		this._formCellPropertyList = _formCellPropertyList;
	}


	public boolean equals(Object o) {
		if(o==null || !(o instanceof W5FormCell))return false;
		W5FormCell c = (W5FormCell)o;
		return c!=null && c.getFormCellId()==formCellId && c.getProjectUuid().equals(projectUuid);
	}
	
	public int hashCode() {
		return projectUuid.hashCode() + 100*formCellId;
	}
	
	@Transient
	public int getParentId() {
		return 0;
	}
}
