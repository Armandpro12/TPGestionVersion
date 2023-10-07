package fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.quetes;

import fr.iut.montreuil.S05_R08.tp01_GestionVersion.controleur.SoundPlayer;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.Joueur;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.acteurs.Acteur;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.acteurs.Pnj;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.items.Armes.Shuriken;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.ressources.Ressource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class QuestLine {
    private ObservableList<Quete> quetes;
    private Joueur joueur;

    public QuestLine(Joueur j){
        joueur = j;
        quetes = FXCollections.observableArrayList();
        quetes.add(new TalkQuete("Chapitre 0 - Le serment du chevalier", "Que dois-je faire ? Je viens de prêter serment à mon seigneur, mais je ne sais pas quelle sera ma première mission.", 10, "Pain", 1, "écuyer"));
        quetes.add(new TalkQuete("Chapitre 1 - La guerre des roses", "Si vous voulez devenir un vrai chevalier, il faudra d'abord faire vos preuves sur le champ de bataille. \n Si vous survivez à la guerre des roses, vous pourrez peut-être obtenir le titre de banneret !!!!\n Serez-vous à la hauteur ?", 5, "Épée", 1, "capitaine"));
        quetes.add(new TalkQuete("Chapitre 1 - La guerre des roses", "'Salut à toi héros, ici tu trouveras tout ce qu'il te faut, va voir le marchand pour acheter des armes ou des provisions'\nAller parler au marchand au nord du camp.", 5, "Vin", 1, "marchand"));
        quetes.add(new LootQuete("Chapitre 1 - La guerre des roses", "'Si tu veux acheter du nouveau matériel, c'est ici que ça se passe ! Tiens d'ailleurs, rends-moi un service tu veux.'\nRécupérer une caisse de munitions à l'ouest.", 10, "Flèche", 1, "CaisseMunition", 1));
        quetes.add(new TalkQuete("Chapitre 1 - La guerre des roses", "'Il faudrait peut-être que je me renseigne à propos de ce parchemin, une fois que j'aurai livré la marchandise bien sûr'\nLivrer les munitions au capitaine.", 40, "Flèche", 3, "capitaine"));

        quetes.add(new TalkQuete("Chapitre 2 - La quête du Graal", "Interroger le roi Arthur au château de Camelot concernant le Graal.", 10, "", 0, "roi Arthur"));
        quetes.add(new TalkQuete("Chapitre 2 - La quête du Graal", "Interroger la dame du lac au bord du lac concernant le Graal.", 10, "", 0, "dame du lac"));
        quetes.add(new KillQuete("Chapitre 2 - La quête du Graal", "'Je peux te révéler un indice sur le Graal, mais tu dois d'abord me prouver ta valeur !'\n Tuer 2 chevaliers noirs.", 5, "", 0, "chevalier noir", 2));
        quetes.add(new KillQuete("Chapitre 2 - La quête du Graal", "Tuer 2 dragons.", 5, "", 0, "dragon", 2));
        quetes.add(new TalkQuete("Chapitre 2 - La quête du Graal", "Rendre la quête à la dame du lac.", 50, "Excalibur", 3, "dame du lac"));

        quetes.add(new TalkQuete("Chapitre 3 - La trahison du maître", "'Tu as été bien naïf, héros. Je t'ai menti sur le livre de Momoku. Il n'existe pas ! C'était juste un prétexte pour te faire accomplir mes basses besognes !'\nAller parler au maître du dojo pour lui demander des explications.", 5, "Niveau", 1, "maître"));
        quetes.add(new KillQuete("Chapitre 3 - La trahison du maître", "'Tu oses me défier, vermisseau ? Tu vas le regretter !'\nTuer 2 disciples du maître au nord.", 5, "", 0, "Disciple", 2));
        quetes.add(new TalkQuete("Chapitre 3 - La trahison du maître", "Retourner voir le maître du dojo.", 100, "Viande", 3, "maître"));
        quetes.add(new KillQuete("Chapitre 3 - La trahison du maître", "'Tu n'es pas si faible que ça, finalement. Mais tu n'es pas de taille face à moi !'\nTuer le maître du dojo.", 10, "", 0, "Maître", 1));
        quetes.add(new TalkQuete("Chapitre 3 - La trahison du maître", "Rendre la quête au sage de la montagne.", 150, "Potion", 2, "sage"));
        quetes.add(new LootQuete("Chapitre 3 - La trahison du maître", "'Tu as vaincu le maître du dojo ? C'est incroyable ! Il était corrompu par le pouvoir et la cupidité. Tu as bien fait de le stopper. Tiens, prends ceci en récompense.'\nRécupérer l'épée du sage.", 10, "", 0, "ÉpéeSage", 1));


        quetes.add(new TalkQuete("Chapitre 4 - Le siège du château", "'Un vieil ami se bat à la frontière sud pour repousser les assaillants, je pense que vous êtes prêts à en savoir plus.'\nAller à la rencontre du baron au sud.", 5, "0", 0, "baron"));
        quetes.add(new KillQuete("Chapitre 4 - Le siège du château", "'Vite héros, tuez les deux catapultes à l'entrée du château !!'\nTuer 2 catapultes.", 10, "", 0, "Catapulte", 2));
        quetes.add(new TalkQuete("Chapitre 4 - Le siège du château", "Retourner voir le baron.", 50, "Potion", 1, "baron"));
        quetes.add(new LootQuete("Chapitre 4 - Le siège du château", "'C'est le roi Arthur qui vous envoie je suppose, vous savez vous battre ça se voit. Les défenses commencent à faiblir vous allez m'aider à renforcer les murailles. J'ai quelque chose pour vous si vous m'aidez.'\nRécupérer 4 pierres de taille.", 15, "", 0, "SourcePierre", 4));
        quetes.add(new TalkQuete("Chapitre 4 - Le siège du château", "Retourner voir le baron.", 50, "Hache", 1, "baron"));
        quetes.add(new KillQuete("Chapitre 4 - Le siège du château", "'Vous semblez honnête héros, je sens que vous êtes quelqu'un de confiance. Prenez cette hache, si c'est le Graal que vous cherchez, il va falloir se battre.'\nTuer 3 chevaliers ennemis.", 10, "", 0, "ChevalierEnnemi", 3));
        quetes.add(new KillQuete("Chapitre 4 - Le siège du château", "Tuer 3 archers ennemis.", 10, "", 0, "ArcherEnnemi", 3));
        quetes.add(new TalkQuete("Chapitre 4 - Le siège du château", "Retourner voir le baron.", 200, "Potion", 3, "baron"));
        quetes.add(new TalkQuete("Chapitre 4 - Le siège du château", "'Vous les avez tués ? Parfait, j'ai réussi à renforcer les murailles. Continuez d'explorer le château, vous trouverez sûrement quelque chose au nord !'\nExplorer le nord du château et trouver des informations.", 10, "", 0, "dame du lac"));
        quetes.add(new TalkQuete("Chapitre 4 - Le siège du château", "'J'ai réussi, j'ai le Graal !! Je devrai rentrer, je ne me sens pas bien...'\nRécupérer le Graal et retourner au campement.", 10, "", 0, "Graal"));

        quetes.add(new TalkQuete("Chapitre 5 - Le destin du héros", "'Vous avez réussi, vous avez le Graal ! Mais à quel prix ? Vous avez perdu vos amis, votre honneur, votre âme...'\nAller parler au roi Arthur au château de Camelot.", 10, "", 0, "roi Arthur"));
        quetes.add(new KillQuete("Chapitre 5 - Le destin du héros", "'Vous êtes un traître, un parjure, un lâche ! Vous avez trahi la confiance du roi, vous avez volé le Graal, vous avez causé la mort de milliers de personnes !'\nTuer 2 chevaliers de la Table Ronde.", 10, "", 0, "ChevalierTableRonde", 2));
        quetes.add(new TalkQuete("Chapitre 5 - Le destin du héros", "Retourner voir le roi Arthur.", 50, "", 0, "roi Arthur"));
        quetes.add(new KillQuete("Chapitre 5 - Le destin du héros", "'Vous n'êtes pas digne du Graal, vous n'êtes pas digne de vivre ! Je vais vous arracher le Graal des mains et vous faire payer pour vos crimes !'\nTuer le roi Arthur.", 10, "", 0, "RoiArthur", 1));
        quetes.add(new TalkQuete("Chapitre 5 - Le destin du héros", "Rendre la quête à la dame du lac au bord du lac.", 200, "", 0, "dame du lac"));
        quetes.add(new TalkQuete("Chapitre 5 - Le destin du héros", "'Vous avez tué le roi Arthur ? C'est horrible ! Vous avez détruit le royaume de Camelot, vous avez plongé le pays dans le chaos ! Vous avez accompli la prophétie du Graal maudit !'\nRécupérer le Graal maudit et affronter votre destin.", 10, "", 0, "GraalMaudit"));
    }

    public ObservableList<Quete> getQuetes() {
        return quetes;
    }

    public void completeQuest(){
        if(getQueteActuelle().getRecompenseObjet().equals("Shuriken"))
            joueur.setArmeDistance(new Shuriken());
        if(getQueteActuelle().getRecompenseObjet().equals("Niveau"))
            joueur.lvlUp();
        else if(!getQueteActuelle().getRecompenseObjet().equals(""))
            joueur.getInventaire().ajouterObjet(getQueteActuelle().getRecompenseObjet(), getQueteActuelle().getQuantiteObjet());
        joueur.getInventaire().ajouterOr(getQueteActuelle().getRecompenseOr());
        quetes.remove(0);
        SoundPlayer.playSpecificSound("quest.wav");
    }

    public Quete getQueteActuelle(){
        if(quetes.isEmpty())
            return null;
        return quetes.get(0);
    }

    public void killTracker(Acteur a){
        if(!(getQueteActuelle() instanceof KillQuete))
            return;
        KillQuete quete = (KillQuete) getQueteActuelle();
        if(a.getClass().getSimpleName().equals(quete.getEnnemyToKill())){
            quete.addCount(1);
        }
        if(quete.getCount()>=quete.getNbKills()){
            completeQuest();
        }
    }

    public void ressourceTracker(Ressource r) {
        if(!(getQueteActuelle() instanceof LootQuete))
            return;
        LootQuete quete = (LootQuete) getQueteActuelle();
        if(r.getClass().getSimpleName().equals(quete.getRessourceToGet())){
            quete.addCount(1);
        }
        if(quete.getCount()>=quete.getNbRessource()){
            completeQuest();
        }
    }

    public void talkTracker(Acteur a) {
        if(!(getQueteActuelle() instanceof TalkQuete))
            return;
        TalkQuete quete = (TalkQuete) getQueteActuelle();
        if(a instanceof Pnj && ((Pnj) a).getNom().equals(quete.getPnjName())) {
            completeQuest();
        }
    }
}
