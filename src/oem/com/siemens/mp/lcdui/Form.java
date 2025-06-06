/*
 * Copyright 2018 Nikita Shakarun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.siemens.mp.lcdui;

import javax.microedition.lcdui.Item;

public class Form extends javax.microedition.lcdui.Form {

	public Form(String title) {
		super(title);
	}

	public Form(String title, Item[] elements) {
		super(title, elements);
	}

	public void setKeyDispatcher(KeyDispatcher dispatcher) {
	}

	public int appendStaticItem(Item item) {
		return append(item);
	}
}