package fernandoschimidt.booknetworkapi.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activateaccount");
    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
