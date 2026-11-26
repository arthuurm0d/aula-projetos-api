    @Test
    void deveRetornarProjetoEmJson() throws Exception {
        mockMvc.perform(get("/api/projetos/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("application/json"))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.nome").value("Portal de Estagios"))
                .andExpect(jsonPath("$.responsavel").value("Equipe ConectaTech"))
                .andExpect(jsonPath("$.status").value("Em desenvolvimento"));
    }
