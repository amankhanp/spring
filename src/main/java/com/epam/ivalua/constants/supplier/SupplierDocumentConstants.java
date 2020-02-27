package com.epam.ivalua.constants.supplier;

import com.epam.ivalua.constants.ContextConstants;

public interface SupplierDocumentConstants {
    String FOLLOW_DOCUMENTS = "//input[@type='checkbox' and @aria-label=\"Check to declare this supplier's documents must be followed\"]";
    String KEYWORDS = "//input[@aria-label='Keywords']";
    String START_TO_DATE = "//input[@type='text' and @aria-label=\"State to date \"]";
    String SEARCH = "//input[@type='submit' and @value='Search']";
    String RESET = "//input[@type='submit' and @value='Reset']";

    String ADD_LEGAL_DOCUMENTS = "//input[@type='submit' and @value=\"Add legal documents\"]";

    String LEGAL_DOCUMENT_DESCRIPTION_TYPE = "//select[@aria-label='Type']";
    String LEGAL_DOCUMENT_DESCRIPTION_LABEL = "//input[@aria-label='Label']";
    String LEGAL_DOCUMENT_DESCRIPTION_VALIDITY_BEGIN_DATE = "//input[@type='text' and @aria-label='Validity begin date']";
    String LEGAL_DOCUMENT_DESCRIPTION_VALIDITY_END_DATE = "//input[@type='text' and @aria-label='Validity end date']";
    String LEGAL_DOCUMENT_DESCRIPTION_DOCUMENT = "//input[@type='button' and @aria-label='Click or Drag to add a file']";

    String LEGAL_DOCUMENT_COMMENTS = "//textarea[@placeholder=\"Add a comment here\"]";

}
