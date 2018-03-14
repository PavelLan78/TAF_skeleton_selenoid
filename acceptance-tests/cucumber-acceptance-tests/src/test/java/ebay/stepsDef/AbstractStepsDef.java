/*
* Copyright 2002 - 2017 the original author or authors.
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
package ebay.stepsDef;

import ebay.configuration.AppConfig;
import org.exampleProject.qa.common.gui.containers.DataContainer;
import org.exampleProject.qa.common.gui.services.attachments.AttachmentsImpl;
import org.exampleProject.qa.common.gui.services.pages.HomePageObject;
import org.exampleProject.qa.common.gui.services.pages.MainSearchFormPageObject;
import org.exampleProject.qa.common.gui.services.pages.ProductCardPageIObject;
import org.exampleProject.qa.common.gui.services.pages.SerpPageObject;
import org.exampleProject.qa.common.gui.services.webdriver.WrappedWebdriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD;

@ContextConfiguration(classes = {AppConfig.class})
@DirtiesContext(classMode = AFTER_EACH_TEST_METHOD)
public class AbstractStepsDef {
    @Value("${site.url:localhost}")
    protected String siteUrl;

    @Autowired
    @Lazy
    public WrappedWebdriver driver;

    @Autowired
    @Lazy
    public DataContainer dataContainer;

    @Autowired
    @Lazy
    public AttachmentsImpl attachments;

    //Page Objects
    @Autowired
    @Lazy
    protected MainSearchFormPageObject mainSearchFormPage;

    @Autowired
    @Lazy
    protected ProductCardPageIObject productCardPage;

    @Autowired
    @Lazy
    protected SerpPageObject serpPage;

    @Autowired
    @Lazy
    protected HomePageObject homePage;

}
