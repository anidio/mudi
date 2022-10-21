package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi Redmi Note 11");
        pedido.setUrlImagem("https://www.tek4life.pt/media/catalog/product/cache/2/image/800x800/85e4522595efc69f496374d01ef2bf13/x/i/xiaomi_redmi_note_11_pro_5g_dual_sim_polar_white_3.jpg");
        pedido.setUrlProduto("https://pt.aliexpress.com/item/1005004137924743.html?spm=a2g0o.productlist.0.0.236e6ba4hgLECv&algo_pvid=711e0746-fbcd-4735-b83b-152841a0d708&algo_exp_id=711e0746-fbcd-4735-b83b-152841a0d708-0&pdp_ext_f=%7B%22sku_id%22%3A%2212000030618161269%22%7D&pdp_npi=2%40dis%21BRL%212382.83%211668.0%21%21%21%21%21%402103250d16663164181377410e123f%2112000030618161269%21sea&curPageLogUid=UvYjo1JEQ0yX  ");
        pedido.setDescricao("Uma descrição qualquer para esse pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
