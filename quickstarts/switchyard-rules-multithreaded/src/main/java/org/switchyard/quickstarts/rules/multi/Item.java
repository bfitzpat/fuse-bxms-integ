/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.quickstarts.rules.multi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Item for WarehouseService.
 *
 * @author Magesh Kumar B <mageshbk@jboss.com> (C) 2012 Red Hat Inc.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
public class Item {

    @XmlElement(name = "itemId", required = true)
    private Integer _itemId;
    @XmlElement(name = "name", required = false)
    private String _name;

    @XmlElement(name = "price", required = true)
    private Integer _price;

    public Item() {
    }

    public Item(Integer itemId, String name, Integer price) {
        _itemId = itemId;
        _name = name;
        _price = price;
    }

    public Integer getItemId() {
        return _itemId;
    }

    public void setItemId(Integer itemId) {
        _itemId = itemId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Integer getPrice() {
        return _price;
    }

    public void setPrice(Integer _price) {
        this._price = _price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{ItemId: ");
        builder.append(_itemId);
        builder.append(", name:");
        builder.append(_name);
        builder.append(", price:");
        builder.append(_price);
        builder.append("}");
        return builder.toString();
    }
}
