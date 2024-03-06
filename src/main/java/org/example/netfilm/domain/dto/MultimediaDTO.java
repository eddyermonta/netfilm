package org.example.netfilm.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MultimediaDTO {
    @JsonIgnore
    private Long idMultimedia;

    public MultimediaDTO(Long idMultimedia) {
        this.idMultimedia = idMultimedia;
    }

    public MultimediaDTO() {
    }

    public Long getIdMultimedia() {
        return idMultimedia;
    }

    public void setIdMultimedia(Long idMultimedia) {
        this.idMultimedia = idMultimedia;
    }
}
