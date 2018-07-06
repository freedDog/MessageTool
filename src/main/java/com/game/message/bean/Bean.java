package com.game.message.bean;

import java.util.List;
import java.util.Set;

public class Bean
{
  private String beanName;
  private String packageName;
  private String explain;
  private List<Field> fields;
  private Set<String> imports;
  
  public String getBeanName()
  {
    return this.beanName;
  }
  
  public void setBeanName(String beanName)
  {
    this.beanName = beanName;
  }
  
  public String getPackageName()
  {
    return this.packageName;
  }
  
  public void setPackageName(String packageName)
  {
    this.packageName = packageName;
  }
  
  public List<Field> getFields()
  {
    return this.fields;
  }
  
  public void setFields(List<Field> fields)
  {
    this.fields = fields;
  }
  
  public String getExplain()
  {
    return this.explain;
  }
  
  public void setExplain(String explain)
  {
    this.explain = explain;
  }
  
  public Set<String> getImports()
  {
    return this.imports;
  }
  
  public void setImports(Set<String> imports)
  {
    this.imports = imports;
  }
}
