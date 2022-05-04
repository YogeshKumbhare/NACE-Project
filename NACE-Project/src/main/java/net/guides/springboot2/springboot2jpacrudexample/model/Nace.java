package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nace")
public class Nace {

	private int order;
	private String level;
	private String code;
	private String parent;
	private String description;
	private String thisItemIncludes;
	private String thisItemAlsoIncludes;
	private String rulings;
	private String thisItemExcludes;
	private String ref;

	public Nace() {
	}

	public Nace(int order, String level, String code, String parent, String description, String thisItemIncludes, String thisItemAlsoIncludes, String rulings, String thisItemExcludes, String ref) {
		this.order = order;
		this.level = level;
		this.code = code;
		this.parent = parent;
		this.description = description;
		this.thisItemIncludes = thisItemIncludes;
		this.thisItemAlsoIncludes = thisItemAlsoIncludes;
		this.rulings = rulings;
		this.thisItemExcludes = thisItemExcludes;
		this.ref = ref;
	}

	@Id
	@Column(name = "id")
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Column(name = "level", nullable = false)
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Column(name = "code", nullable = false)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	@Column(name = "parent", nullable = false)
	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "this_item_includes", nullable = false)
	public String getThisItemIncludes() {
		return thisItemIncludes;
	}

	public void setThisItemIncludes(String thisItemIncludes) {
		this.thisItemIncludes = thisItemIncludes;
	}
	@Column(name = "this_item_also_includes", nullable = false)
	public String getThisItemAlsoIncludes() {
		return thisItemAlsoIncludes;
	}

	public void setThisItemAlsoIncludes(String thisItemAlsoIncludes) {
		this.thisItemAlsoIncludes = thisItemAlsoIncludes;
	}
	@Column(name = "rulings", nullable = false)
	public String getRulings() {
		return rulings;
	}

	public void setRulings(String rulings) {
		this.rulings = rulings;
	}
	@Column(name = "this_item_excludes", nullable = false)
	public String getThisItemExcludes() {
		return thisItemExcludes;
	}

	public void setThisItemExcludes(String thisItemExcludes) {
		this.thisItemExcludes = thisItemExcludes;
	}
	@Column(name = "ref", nullable = false)
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
}
