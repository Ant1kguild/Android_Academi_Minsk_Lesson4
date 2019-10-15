package com.android.academi.fundamental.listadaptera.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.koin.core.KoinComponent

@Parcelize
data class MovieInfo(
    val title: String,
    val description: String,
    val urlImage: String,
    val urlMovieTrailer: String,
    val releaseDate: String

) : Parcelable

class MovieListInfo : KoinComponent {
    private val movies = listOf(
        MovieInfo(
            "Jurassic World",
            "Brothers Zach and Gray Mitchell visit Jurassic World, a dinosaur theme park on Isla Nublar, of which their aunt Claire Dearing is the operations manager." +
                    " Claire assigns her assistant Zara as the boys' guide, but they evade her and explore on their own. Elsewhere on the island, U.S." +
                    " Navy veteran and ethologist Owen Grady has been training four Velociraptors and researching their intelligence. Based on the raptors' ability" +
                    " to follow commands, head of InGen security Vic Hoskins believes that the animals can be weaponized, an idea Owen and his assistant Barry begrudgingly" +
                    " oppose Prior to its opening, Claire and park owner Simon Masrani inspect the park's newest attraction, the Indominus rex, a genetically-engineered " +
                    "dinosaur created by geneticist Dr. Henry Wu. Masrani tasks Owen with evaluating the enclosure. Owen warns Claire that the Indominus lacks social skills, " +
                    "making it dangerous and unpredictable. When it seems that the Indominus has escaped, Owen and two park workers enter the enclosure. The Indominus, " +
                    "which can camouflage itself and mask its heat signature, suddenly appears. Owen survives, but it devours the other two men before escaping into the island's" +
                    " interior. Owen advises Masrani to have the Indominus killed, but with an interest to protect his company's investment, Masrani dispatches a specialized" +
                    " unit to subdue it with non-lethal weaponry. After most of the unit is slaughtered, Claire orders the evacuation of the island's northern sector" +
                    "While exploring the park in a tour vehicle, Zach and Gray enter a restricted area. The Indominus arrives and destroys the vehicle but the boys narrowly" +
                    " escape. They find the ruins of the original Jurassic Park visitor center, repair an old Jeep Wrangler, and drive back to the park resort." +
                    " As Claire and Owen search for the boys, they barely escape the Indominus. Masrani and two troopers hunt the Indominus by helicopter but it breaks into " +
                    "the park's aviary, releasing pterosaurs – Pteranodon and Dimorphodon species – which collide with the helicopter, causing it to crash, killing Masrani " +
                    "and his troopers in the process. Gray and Zach find Owen and Claire at the resort as armed personnel shoot down swarming pterosaurs with tranquilizers." +
                    "Assuming command, Hoskins orders the raptors to be used to track the Indominus. Forced to comply, Owen leads the raptors. Upon finding the Indominus, " +
                    "the dinosaurs begin communicating among themselves. Owen realizes that the Indominus has Velociraptor DNA, and it usurps Owen's dominance, " +
                    "becoming the pack's new alpha. Troops fire on the Indominus, but it escapes. The raptors slaughter most of the troops, but one raptor is killed. " +
                    "Hoskins evacuates Wu and the dinosaur embryos from the island to protect Wu's research. Owen, Claire, and the boys find Hoskins at the lab, but a " +
                    "raptor breaks in and kills him." +
                    "Owen re-establishes his bond with the three raptors before the Indominus reappears. They attack the Indominus but two are killed. " +
                    "Claire releases the park's Tyrannosaurus rex and lures it into a battle with the Indominus, which gains the advantage over the T. rex until Blue, " +
                    "the last surviving raptor, joins the battle. The Indominus is cornered at the lagoon's edge, where it is dragged underwater by the park's Mosasaurus. " +
                    "The survivors are evacuated and the island is abandoned again. Zach and Gray are reunited with their parents, while Owen and Claire decide to stay together.",
            "https://image.tmdb.org/t/p/w342/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg",
            "https://www.youtube.com/watch?v=RFinNxS5KN4",
            "June 12, 2015"

        ),
        MovieInfo(
            "The Meg",
            "Rescue diver Jonas Taylor is attempting to save the crew of a damaged nuclear submarine when he sees the hull of the sub being rammed by a giant creature." +
                    " Two of his crew are trapped in the damaged sub; Taylor is forced to flee, realizing that attempting rescue would result in the death of everyone on " +
                    "the deep-submergence rescue vehicle. Moments later, the nuclear sub explodes. Taylor's account of the story is dismissed by fellow survivor Dr. Heller," +
                    " who believes that Taylor turned coward due to pressure-induced psychosis." +
                    "Five years later, billionaire Jack Morris meets Dr. Minway Zhang at a 1.3 billion underwater research facility called Mana One," +
                    " which Morris has financed. Zhang and his daughter, Suyin, an oceanographer, supervise a mission to explore what could be an even deeper section of " +
                    "the Mariana Trench, concealed by a thermocline of hydrogen sulfide. The mission submersible is piloted by Lori, Taylor’s ex-wife, accompanied by " +
                    "scientists Toshi. Their theory proves true as they discover an abundance of never-seen flora and fauna below the thermocline. " +
                    "A large creature collides with the submersible and causes it to lose contact with Mana One." +
                    "An old friend of Taylor's, Mana One operations manager James  Mackreides, suggests sending Taylor down to attempt a rescue. " +
                    "Despite Heller's objections, Zhang and Mac venture to Thailand to recruit Taylor. Suyin attempts the rescue in their absence, " +
                    "but is attacked by a giant squid. Before the squid can crush her submersible, it is killed by a giant, 25-metre (82 ft) shark. " +
                    "Taylor, having agreed to help, reaches Mana One and saves Lori and The Wall, but Toshi sacrifices himself when the shark returns, " +
                    "allowing the others to escape while he diverts the creature's attention." +
                    "Back at Mana One, the crew discovers that the giant shark is a megalodon, the largest shark ever discovered and thought to be extinct " +
                    "for millions of years. While discussing how to deal with it, Suyin's daughter Meiying witnesses the shark outside the observation ring, " +
                    "as it bisects a humpback whale in one bite. The crew realizes that it followed them through a temporary break they caused in the thermocline, " +
                    "allowing it to escape. The group manages to track and poison the megalodon, but in their moment of triumph a second much larger megalodon emerges, " +
                    "killing The Wall and Heller and fatally wounding Zhang as it devours the dead megalodon." +
                    "Morris enlists a mercenary team to depth-charge the shark, but Morris falls overboard in the failed attempt and he is killed. " +
                    "Receiving no assistance from surrounding governments, Taylor and the remaining Mana One crew resolve to track and kill the shark on their own. " +
                    "The megalodon is en route to a crowded beach on Sanya Bay in China. It kills several beachgoers before the Mana One crew projects audio of a whale" +
                    " call to divert the shark's attention toward them. Taylor manages to cut the megalodon's abdomen with his sub, as well as stab it in the eye." +
                    " Other sharks, attracted by the megalodon's blood, approach and devour the immobilized megalodon. Taylor rejoins Suyin," +
                    " Mac and DJ, and he and Suyin consider taking a vacation together.",
            "https://image.tmdb.org/t/p/w342/eyWICPcxOuTcDDDbTMOZawoOn8d.jpg",
            "https://www.youtube.com/watch?v=udm5jUA-2bs",
            "August 10, 2018"
        ),
        MovieInfo(
            "The Purge",
            "In 2014, the New Founding Fathers of America, a totalitarian political party, are voted into office following an economic collapse. They pass a law that sanctions an annual \"Purge\": for 12 hours each year all crime, including murder, arson, theft and rape, is legal, except against government officials, and all emergency services are unavailable until 7 am. By 2022, the United States has become virtually crime-free and the unemployment rate has dropped to 1%, ostensibly because of the Purge." +
                    "James Sandin returns to his home in an affluent Los Angeles gated community to wait out the night with his wife Mary and their children, Zoey and Charlie. The family is assured that the security system manufactured by James' company will keep them safe. While the family awaits the start of the purge, Zoey meets her boyfriend Henry, an older boy whom James dislikes as he is eighteen, deeming him too old for his daughter. James enables the security system, and as the purge begins, the family disperses in their home to go about their normal routines." +
                    "Zoey returns to her room to unexpectedly find Henry, who had snuck back in before the security system was engaged, and says that he plans to confront her father about their relationship. Meanwhile, Charlie watches the security monitors, and sees a wounded man calling for help. He temporarily disables the system to allow the man into the house. James races to re-engage the system and holds the man at gunpoint. Henry comes downstairs and pulls a gun on James, but James fires back, mortally wounding Henry. During the chaos, the wounded man disappears and hides." +
                    "Through the surveillance cameras, the family witness a gang of masked, heavily armed people arriving at the front lawn. The leader warns them that failure to surrender the wounded man will result in invasion. Mary asks James if the security system will protect them, but James admits the system will not actually resist a determined assault. They decide to find the man and give him to the purge gang outside, but after capturing him they realize they are no better than the gang. They decide to spare the man, and defend themselves against the gang." +
                    "With their deadline having passed, the gang uses chains attached to a truck to rip the metal plating off the front door and enter the house. James fights back with a shotgun and kills several gang members before he is stabbed by the leader. Charlie views the surveillance cameras, and notices their neighbors leaving their homes. The neighbors overpower and kill the remaining gang members. Mary is captured and humiliated by two purgers, who try to tickle her to death, only to be killed by the neighbors before they can do so. The gang leader reappears, brandishing a shotgun to kill the family, but is fatally shot by Zoey, who is wielding Henry's handgun. James succumbs to his wound and dies in front of Mary, Zoey, and Charlie, leaving them in tears." +
                    "Mary thanks their neighbors for their support, but one of them, Grace Ferrin, reveals their hatred for the Sandins due to the wealth acquired at their expense. They tie Mary, Charlie, and Zoey up with duct tape, pulling them out into the hallway to kill them, but as the neighbors make a ritualistic preparation for the murder, the man whom Charlie let in earlier re-emerges. He shoots a neighbor dead and holds Grace hostage, forcing the neighbors to free the Sandins. Mary prevents the stranger from killing the other neighbors, deciding that they will all wait out the remainder of the Purge without any violence." +
                    "The next morning, in the last few minutes of the Purge, Mary, Grace, the stranger, and the neighbors wait in the living room. Mary asks a neighbor, Mr. Halverson, if he enjoyed Grace's  (the meeting of the neighbors to discuss the plans for the murders), to which Halverson affirms. As Charlie and Zoey mourn James' death, Grace attempts to seize a shotgun from Mary; Mary regains control of the shotgun, rams the stock of the gun into Grace's nose and throws her head down onto a glass table, furiously ordering for an end to the violence. Mary orders Grace and the neighbors out of the house as the siren sounds, signaling the conclusion of the Purge. After the neighbors depart, Mary thanks the stranger for his help and he bids the Sandins good luck as he leaves the gun behind that he was using." +
                    "During the credits, news reports are heard, which state that this year’s purge was the most successful to date. Other stations broadcast that the stock market is booming due to the massive sales of weapons and security systems. A man’s voice speaks of the loss of his patriotism after the death of his sons the night before.",
            "https://image.tmdb.org/t/p/w342/2slvblTroiT1lY9bYLK7Amigo1k.jpg",
            "https://www.youtube.com/watch?v=UL29y0ah92w",
            "June 7, 2013"
        ),
        MovieInfo(
            "Deadpool 2",
            "After fighting organized crime as the mercenary Deadpool for two years, Wade Wilson fails to kill one of his targets on his anniversary with Vanessa, his girlfriend. That night, after the pair decide to start a family together, the target tracks Wilson down and inadvertently kills Vanessa. Wilson kills the man in revenge, and blaming himself for her death attempts to commit suicide six weeks later by blowing himself up. Wilson has a vision of Vanessa in the afterlife, but the pieces of his body remain alive and are put back together by Colossus. Wilson is left with only a Skee-Ball token, an anniversary gift, as a final memento of Vanessa.\n" +
                    "Recovering at the X-Mansion, Wilson reluctantly agrees to join the X-Men because he believes Vanessa would have wanted him to. He, Colossus, and Negasonic Teenage Warhead respond to a standoff between authorities and the unstable young mutant Russell Collins / Firefist at an orphanage, labeled a \"Mutant Reeducation Center\". Wilson realizes that Collins has been abused by the orphanage staff, and kills one of the staff members. Colossus stops him from killing anyone else, and both Wilson and Collins are arrested. Restrained with collars that suppress their powers, they are taken to the Ice Box, an isolated prison for mutant criminals. Meanwhile, Cable—a cybernetic soldier from the future whose family is murdered by an older Collins—travels back in time to kill Collins before he ever becomes a killer." +
                    "Cable breaks into the Ice Box and attacks Collins. Wilson, whose collar breaks in the ensuing melee, attempts to defend Collins. After Cable takes Vanessa's token, Wilson forces himself and Cable out of the prison, but not before Collins overhears Wilson deny that he cares for the young mutant. Near death again, Wilson has another vision of Vanessa in which she convinces him to help Collins. Wilson organizes a team called X-Force to break Collins out of a prison-transfer convoy and defend him from Cable. The team launches its assault on the convoy by parachute, but all of the members die during the landing except for Wilson and the lucky Domino. While they fight Cable, Collins frees fellow inmate Juggernaut, who agrees to help Collins kill the abusive orphanage headmaster. Juggernaut destroys the convoy, allowing himself and Collins to escape." +
                    "Cable offers to work with Wilson and Domino to stop Collins' first murder, and agrees to give Wilson a chance to talk Collins down. At the orphanage, they are overpowered by Juggernaut while Collins attacks the headmaster, until Colossus—who had at first refused to help Wilson due to Wilson's murderous ways—arrives to distract Juggernaut. When Wilson fails to talk down Collins, Cable shoots at the young mutant. Wilson leaps in front of the bullet while wearing the Ice Box collar and dies, reuniting with Vanessa in the afterlife. Seeing this sacrifice, Collins does not kill the headmaster; this changes the future so that Cable's family now survives. Cable uses the last charge on his time-traveling device, which he needed for returning to his family, to go back several minutes and strap Vanessa's token in front of Wilson's heart. Now when Wilson takes the bullet for Collins, it is stopped by the token and both survive while Collins still has his change of heart. Afterwards, the headmaster is run over by Wilson's taxi-driver friend Dopinder. Knowing that his family is now safe, Cable decides to stay in the past for a while to help better the world." +
                    "In a mid-credits sequence, Negasonic Teenage Warhead and her girlfriend Yukio repair Cable's time-traveling device for Wilson. He uses it to save the lives of Vanessa and X-Force member Peter, and kills both X-Men Origins: Wolverine's version of Deadpool and actor Ryan Reynolds while he is considering starring in the film Green Lantern.",
            "https://image.tmdb.org/t/p/w342/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg",
            "https://www.youtube.com/watch?v=D86RtevtfrA",
            "May 18, 2018"
        ),
        MovieInfo(
            "Black Panther",
            "Thousands of years ago, five African tribes war over a meteorite containing the metal vibranium. One warrior ingests a  affected by the metal and gains superhuman abilities, becoming the first. He unites all but the Jabari Tribe to form the nation of Wakanda. Over centuries, the Wakandans use the vibranium to develop advanced technology and isolate themselves from the world by posing as a Third World country. In 1992, Wakanda's King T'Chaka visits his brother N'Jobu, who is working undercover in Oakland, California. T'Chaka accuses N'Jobu of assisting black-market arms dealer Ulysses Klaue with stealing vibranium from Wakanda. N'Jobu's partner reveals he is Zuri, another undercover Wakandan, and confirms T'Chaka's suspicions." +
                    "In the present day, following T'Chaka's death,[N 1] his son T'Challa returns to Wakanda to assume the throne. He and Okoye, the leader of the Dora Milaje regiment, extract T'Challa's ex-lover Nakia from an undercover assignment so she can attend his coronation ceremony with his mother Ramonda and younger sister Shuri. At the ceremony, the Jabari Tribe's leader M'Baku challenges T'Challa for the crown in ritual combat. T'Challa defeats M'Baku and persuades him to yield rather than die." +
                    "When Klaue and his accomplice Erik Stevens steal a Wakandan artifact from a London museum, T'Challa's friend and Okoye's lover W'Kabi urges him to bring Klaue back alive. T'Challa, Okoye, and Nakia travel to Busan, South Korea, where Klaue plans to sell the artifact to CIA agent Everett K. Ross. A firefight erupts and Klaue attempts to flee but is caught by T'Challa, who reluctantly releases him to Ross' custody. Klaue tells Ross that Wakanda's international image is a front for a technologically advanced civilization. Erik attacks and extracts Klaue as Ross is gravely injured protecting Nakia. Rather than pursue Klaue, T'Challa takes Ross to Wakanda, where their technology can save him." +
                    "While Shuri heals Ross, T'Challa confronts Zuri about N'Jobu. Zuri explains that N'Jobu planned to share Wakanda's technology with people of African descent around the world to help them conquer their oppressors. As T'Chaka arrested N'Jobu, the latter attacked Zuri and forced T'Chaka to kill him. T'Chaka ordered Zuri to lie that N'Jobu had disappeared and left behind N'Jobu's American son in order to maintain the lie. This boy grew up to be Stevens, a U.S. black ops soldier who adopted the name . Meanwhile, Killmonger kills Klaue and takes his body to Wakanda. He is brought before the tribal elders, revealing his identity to be N'Jadaka and claim to the throne. Killmonger challenges T'Challa to ritual combat, where he kills Zuri, defeats T'Challa, and hurls him over a waterfall to his presumed death. Killmonger ingests the heart-shaped herb and orders the rest incinerated, but Nakia extracts one first. Killmonger, supported by W'Kabi and his army, prepares to distribute shipments of Wakandan weapons to operatives around the world." +
                    "Nakia, Shuri, Ramonda, and Ross flee to the Jabari Tribe for aid. They find a comatose T'Challa, rescued by the Jabari in repayment for sparing M'Baku's life. Healed by Nakia's herb, T'Challa returns to fight Killmonger, who dons his own Black Panther suit. W'Kabi and his army fight Shuri, Nakia, and the Dora Milaje, while Ross remotely pilots a jet and shoots down planes carrying the vibranium weapons. M'Baku and the Jabari arrive to reinforce T'Challa. Confronted by Okoye, W'Kabi and his army stand down. Fighting in Wakanda's vibranium mine, T'Challa disrupts Killmonger's suit and stabs him. Killmonger refuses to be healed, choosing to die a free man rather than be incarcerated." +
                    "T'Challa establishes an outreach center at the building where N'Jobu died, to be run by Nakia and Shuri. In a mid-credits scene, T'Challa appears before the United Nations to reveal Wakanda's true nature to the world. In a post-credits scene, Shuri helps Bucky Barnes with his recuperation.",
            "https://image.tmdb.org/t/p/w342/uxzzxijgPIY7slzFvMotPv8wjKA.jpg",
            "https://www.youtube.com/watch?v=xjDjIWPwcPU",
            "February 16, 2018"
        ),
        MovieInfo(
            "OCEAN'S 8",
            "Newly paroled con artist Debbie Ocean – the  Danny Ocean's younger sister – convinces former partner-in-crime Lou to join her in a new heist. They assemble their team: bankrupt fashion designer Rose Weil, jewelry maker Amita, eager to move out of her mother's house, hacker Nine Ball, street hustler and pickpocket Constance, and profiteer Tammy, who fences stolen goods out of her suburban home." +
                    "Debbie plans to steal the Toussaint, a 150 million Cartier necklace, during the upcoming Met Gala and use movie star Daphne Kluger as a mule. The team manipulates Daphne into hiring Weil and convince Cartier to loan Daphne the Toussaint. They digitally scan the necklace to manufacture a cubic zirconia counterfeit. Tammy secures a job at Vogue and gains access to the gala, and Debbie leads Daphne to invite art dealer Claude Becker, whose betrayal sent Debbie to prison, as her date. Lou confronts Debbie for planning revenge against Becker, but Debbie reassures her this is not the case." +
                    "When Rose learns the Toussaint can only be unclasped by a special magnet carried by the bodyguards hired by Cartier, Nine Ball enlists her younger sister Veronica's help in defeating the mechanism. At the gala, Lou spikes Daphne's soup, causing her to vomit in the restroom, a blind spot to the Met's cameras created by Nine Ball. Constance removes the necklace and sneaks it to Amita, who splits it into smaller pieces of jewelry. The Toussaint's disappearance triggers the museum's evacuation, but the search ends when Tammy  the duplicate necklace. Constance slips the Toussaint pieces to the team to smuggle out; Debbie plants a piece on Becker. After the heist, Debbie and Lou reveal Daphne had been in on the plan." +
                    "Cartier discovers the recovered necklace is a fake and dispatches insurance investigator John Frazier. Having crossed paths with the Oceans before, Frazier immediately suspects Debbie, but her careful presence on the gala's video footage gives her an unbeatable alibi. She tells Frazier she may know who stole the necklace. Daphne visits Becker and sends Frazier a picture of the jewel Debbie planted. To further frame Becker, Debbie hires actresses posing as elderly socialites to sell the Toussaint pieces and deposit the money in Becker's name. Frazier takes Becker into custody." +
                    "As the eight celebrate their victory, Lou reveals the heist's true target: while the gala was being evacuated, she and  Yen replaced a Met display of royal jewels with replicas, escaping with gems even more valuable than the Toussaint. With a larger-than-expected share of the score, each member of the team goes her separate way: Amita travels to Paris with a man she meets on Tinder, Weil pays off her debts and opens her own store, Constance buys a spacious loft in the city and becomes a YouTuber, Tammy expands her business in stolen goods, Nine Ball opens a pool bar, Daphne becomes a film director, Lou goes on a cross-country road trip, and Debbie visits Danny's grave with a martini in his honor.",
            "https://image.tmdb.org/t/p/w342/MvYpKlpFukTivnlBhizGbkAe3v.jpg",
            "https://www.youtube.com/watch?v=n5LoVcVsiSQ",
            "June 8, 2018"
        ),
        MovieInfo(
            "Interstellar",
            "In the mid-21st century, crop blights and dust storms threaten humanity's survival. Corn is the last viable crop. The world has also evolved into a post-truth society where younger generations are taught ideas such as the Apollo moon missions were faked. Widowed engineer and former NASA pilot Joseph Cooper is now a farmer. Living with him are his father-in-law, Donald; his 15-year-old son, Tom; and 10-year-old daughter, Murphy. After a dust storm, strange patterns made from dust inexplicably appear on Murphy's bedroom floor, she attributes the anomaly to a ghost. Cooper eventually deduces the patterns were caused by gravity variations and are a binary code for geographic coordinates. Cooper follows the coordinates to a secret NASA facility headed by Professor John Brand, Cooper's former supervisor. Professor Brand says gravitational anomalies have happened elsewhere. 48 years earlier, unknown beings positioned a wormhole near Saturn, opening a path to a distant galaxy with twelve potentially habitable worlds located near a black hole named Gargantua. Twelve volunteers traveled through the wormhole to individually survey the planets. Astronauts Miller, Edmunds, and Mann reported positive results. Based on their data, Professor Brand conceived two plans to ensure humanity's survival. Plan A involves developing a gravitational propulsion theory to propel a mass exodus, while Plan B involves launching the Endurance spacecraft carrying 5,000 frozen human embryos to colonize a habitable planet.",
            "https://image.tmdb.org/t/p/w342/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg",
            "https://www.youtube.com/watch?v=zSWdZVtXT7E&t=1s",
            "November 7, 2014"
        ),
        MovieInfo(
            "Thor: Ragnarok",
            "Two years after the battle of Sokovia,[N 1] Thor is imprisoned by the fire demon Surtur, who reveals that Thor's father Odin is no longer on Asgard. He explains that the realm will soon be destroyed during the prophesied Ragnarök, once Surtur unites his crown with the Eternal Flame that burns in Odin's vault. Thor frees himself, defeats Surtur and takes his crown, believing he has prevented Ragnarök.",
            "https://image.tmdb.org/t/p/w342/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg",
            "https://www.youtube.com/watch?v=ue80QwXMRHg",
            "November 3, 2017"
        ),
        MovieInfo(
            "Guardians of the Galaxy",
            "In 1988, following his mother's death, a young Peter Quill is abducted from Earth by the Ravagers, a group of alien thieves and smugglers led by Yondu Udonta. Twenty-six years later on the planet Morag, Quill steals a mysterious orb but is attacked by Korath, a subordinate to the fanatical Kree militant, Ronan. Although Quill escapes with the orb, Yondu discovers his theft and issues a bounty for his capture, while Ronan sends the assassin Gamora after the orb.",
            "https://image.tmdb.org/t/p/w342/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg",
            "https://www.youtube.com/watch?v=d96cjJhvlMA&t=1s",
            "August 1, 2014"
        )
    )

    fun getAllMovies(): List<MovieInfo> = movies

    fun getSize() = movies.size

    fun getPosition(pos: Int): MovieInfo = movies[pos]
}

