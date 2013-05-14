package com.extjs.gxt.ui.client.data;

import java.util.Map;
import com.extjs.gxt.ui.client.data.BeanModelFactory;
import com.extjs.gxt.ui.client.core.FastMap;

public class BeanModelLookupImpl extends com.extjs.gxt.ui.client.data.BeanModelLookup {
  private Map<String, BeanModelFactory> map;
  public BeanModelFactory getFactory(Class beanClass) {
    if (map == null) {
      map = new FastMap<BeanModelFactory>();
    }
    BeanModelFactory factory = map.get(beanClass.getName());
    if (factory == null) {
    }
    return factory;
  }
}
