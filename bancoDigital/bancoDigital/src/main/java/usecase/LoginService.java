package usecase;

import model.Usuario;

public class LoginService {
    private Usuario usuarioLogado;

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /* public Boolean logar(String login, String senha){
        //todo
        //usuario = verificarUsuario
        //usuarioLogado = usuario
        //verificarNoBanco
        return null;
    }

    public Usuario verificarUsuario(String login, String senha){
        //todo
        //verificarLogin
        //verificarSenha
        //logar
        return null;
    }

    public Boolean deslogar(){
        if(usuarioLogado == null){
            return false;
        }else{
            usuarioLogado = null;
            return true;
        }
    }

    public void cadastrarUsuario(UsuarioDTO usuarioDTO, ClienteDTO clienteDTO ){

        //validarUsuarioCadastrado
        //validarClienteCadastrado
        //todo
    }

    public  Boolean validarUsuarioCadastrado(UsuarioDTO usuarioDTO){
        //todo
        return null;
    }

    public Boolean validarClienteCadastrado(ClienteDTO clienteDTO){
        //todo
        return null;
    }

    */

}
